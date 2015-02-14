package com.solution.p2p.core.account.service;


import com.solution.p2p.core.account.dao.CapitalAccountFlowMapper;
import com.solution.p2p.core.account.dao.CapitalAccountMapper;

import com.solution.p2p.core.common.entity.CapitalAccount;
import com.solution.p2p.core.common.entity.CapitalAccountExample;
import com.solution.p2p.core.common.entity.CapitalAccountFlow;
import com.solution.p2p.core.common.service.AccountService;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.utils.AccountCategaryEnum;
import com.solution.p2p.core.common.utils.AccountFlowTypeEnum;
import com.solution.p2p.core.common.utils.CommonState;
import com.solution.p2p.core.common.utils.ServiceResult;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 下午4:46
 * To change this template use File | Settings | File Templates.
 */
public class AccountServiceImpl extends BasicServiceImpl implements AccountService {

    private CapitalAccountMapper capitalAccountMapper;

    private CapitalAccountFlowMapper capitalAccountFlowMapper;

    public void setCapitalAccountMapper(CapitalAccountMapper capitalAccountMapper) {
        this.capitalAccountMapper = capitalAccountMapper;
    }

    public void setCapitalAccountFlowMapper(CapitalAccountFlowMapper capitalAccountFlowMapper) {
        this.capitalAccountFlowMapper = capitalAccountFlowMapper;
    }

    @Override
    public ServiceResult<List<CapitalAccount>> initUserAccount(Long userId, String userName, String appKey, String sign) {
        logger.debug("init one user's account, user id:[{}], name:[{}]", userId, userName);
        ServiceResult<List<CapitalAccount>> serviceResult = new ServiceResult<List<CapitalAccount>>();
        if(!checkSign(userId, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }

        CapitalAccountExample cae = new CapitalAccountExample();
        CapitalAccountExample.Criteria criteria = cae.createCriteria();
        criteria.andUserIdEqualTo(userId);

        List<CapitalAccount> capitalAccountList = capitalAccountMapper.selectByExample(cae);
        if(capitalAccountList != null && capitalAccountList.size() > 0){
            logger.error("user:[{}] account inited already.",userId);
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.BAD_REQUEST.value());
            serviceResult.setErrorMessage("user account already exists!");
            return serviceResult;
        }
        capitalAccountList = new ArrayList<CapitalAccount>();

        CapitalAccount capitalAccountCash = new CapitalAccount();
        capitalAccountCash.setUserId(userId);
        capitalAccountCash.setUserName(userName);
        capitalAccountCash.setAmount(BigDecimal.ZERO);
        capitalAccountCash.setCategary(AccountCategaryEnum.CASH.getCate());
        capitalAccountCash.setState(CommonState.NORMAL.getState());
        capitalAccountCash.setCreatedTime(new Date());
        capitalAccountMapper.insertSelective(capitalAccountCash);

        CapitalAccount capitalAccountCoin = new CapitalAccount();
        capitalAccountCoin.setUserId(userId);
        capitalAccountCoin.setUserName(userName);
        capitalAccountCoin.setAmount(BigDecimal.ZERO);
        capitalAccountCoin.setCategary(AccountCategaryEnum.V_COIN.getCate());
        capitalAccountCoin.setState(CommonState.NORMAL.getState());
        capitalAccountCoin.setCreatedTime(new Date());

        capitalAccountMapper.insertSelective(capitalAccountCoin);

        CapitalAccount capitalAccountJF = new CapitalAccount();
        capitalAccountJF.setUserId(userId);
        capitalAccountJF.setUserName(userName);
        capitalAccountJF.setAmount(BigDecimal.ZERO);
        capitalAccountJF.setCategary(AccountCategaryEnum.JF.getCate());
        capitalAccountJF.setState(CommonState.NORMAL.getState());

        capitalAccountMapper.insertSelective(capitalAccountJF);

        capitalAccountList.add(capitalAccountCash);
        capitalAccountList.add(capitalAccountCoin);
        capitalAccountList.add(capitalAccountJF);
        serviceResult.setSuccess(true);
        serviceResult.setValue(capitalAccountList);
        return serviceResult;
    }

    @Override
    public ServiceResult<CapitalAccount> createAccountByInvest(CapitalAccount capitalAccount,String appKey, String sign) {
        logger.debug("create invest account, account:[{}]", capitalAccount);
        ServiceResult<CapitalAccount> serviceResult = new ServiceResult<CapitalAccount>();
        if(!checkSign(capitalAccount, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }

        if(capitalAccount == null
                || capitalAccount.getCategary() != AccountCategaryEnum.INVEST.getCate()
                || StringUtils.isEmpty(capitalAccount.getUserId())
                || StringUtils.isEmpty(capitalAccount.getProdId())
                || capitalAccount.getAmount().compareTo(BigDecimal.ZERO) <= 0){
            logger.error("create invest account,account[{}], some value is empty!");
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.BAD_REQUEST.value());
            serviceResult.setErrorMessage("some param needed,but empty.");
            return serviceResult;
        }

        CapitalAccountExample cae = new CapitalAccountExample();
        CapitalAccountExample.Criteria criteria = cae.createCriteria();
        criteria.andUserIdEqualTo(capitalAccount.getUserId());
        criteria.andCategaryEqualTo(AccountCategaryEnum.CASH.getCate());
        List<CapitalAccount> userCashAccountList = capitalAccountMapper.selectByExample(cae);
        if(userCashAccountList == null || userCashAccountList.size() != 1 ){
            logger.error("user:[{}] cash account exception, please check it", capitalAccount.getUserId());
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            serviceResult.setErrorMessage("user's cash account does not exists or has more than one cash account.");
            return serviceResult;
        }
        CapitalAccount userCashAccount = userCashAccountList.get(0);
        if(userCashAccount.getAmount().compareTo(capitalAccount.getAmount()) < 0){
            logger.error("user:[{}] cash account not enough amount", capitalAccount.getUserId());
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            serviceResult.setErrorMessage("user's cash account does not has enough amount.");
            return serviceResult;
        }
        Date now = new Date();
        capitalAccount.setCreatedTime(now);
        capitalAccountMapper.insertSelective(capitalAccount);

        userCashAccount.setAmount(userCashAccount.getAmount().subtract(capitalAccount.getAmount()));
        capitalAccountMapper.updateByPrimaryKeySelective(userCashAccount);

        CapitalAccountFlow capitalAccountFlow = new CapitalAccountFlow();
        capitalAccountFlow.setAccountId(capitalAccount.getId());
        capitalAccountFlow.setFlowType(AccountFlowTypeEnum.INCOME.getType());
        capitalAccountFlow.setIncome(capitalAccount.getAmount());
        capitalAccountFlow.setExpense(BigDecimal.ZERO);
        capitalAccountFlow.setBalanceAmount(capitalAccount.getAmount());
        capitalAccountFlow.setState(CommonState.NORMAL.getState());
        capitalAccountFlow.setProdId(capitalAccount.getProdId());
        capitalAccountFlow.setProdName(capitalAccount.getProdName());
        capitalAccountFlow.setCreatedTime(now);
        capitalAccountFlow.setRemark("新投资");
        capitalAccountFlowMapper.insertSelective(capitalAccountFlow);

        capitalAccountFlow = new CapitalAccountFlow();
        capitalAccountFlow.setAccountId(userCashAccount.getId());
        capitalAccountFlow.setFlowType(AccountFlowTypeEnum.PAY.getType());
        capitalAccountFlow.setIncome(BigDecimal.ZERO);
        capitalAccountFlow.setExpense(capitalAccount.getAmount());
        capitalAccountFlow.setBalanceAmount(userCashAccount.getAmount());
        capitalAccountFlow.setState(CommonState.NORMAL.getState());
        capitalAccountFlow.setCreatedTime(now);
        capitalAccountFlow.setRemark("购买产品"+capitalAccount.getProdName());
        capitalAccountFlowMapper.insertSelective(capitalAccountFlow);

        serviceResult.setSuccess(true);
        serviceResult.setValue(capitalAccount);
        return serviceResult;
    }

    @Override
    public ServiceResult<CapitalAccount> createAccountByLoan(CapitalAccount capitalAccount, String appKey, String sign) {
        logger.debug("create loan account, account:[{}]", capitalAccount);
        ServiceResult<CapitalAccount> serviceResult = new ServiceResult<CapitalAccount>();
        if(!checkSign(capitalAccount, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        if(capitalAccount == null
                || capitalAccount.getCategary() != AccountCategaryEnum.LOAN.getCate()
                || StringUtils.isEmpty(capitalAccount.getUserId())
                || StringUtils.isEmpty(capitalAccount.getLoanId())
                || capitalAccount.getAmount().compareTo(BigDecimal.ZERO) <= 0){
            logger.error("create loan account,account[{}], some value is empty!");
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.BAD_REQUEST.value());
            serviceResult.setErrorMessage("some param needed,but empty.");
            return serviceResult;
        }
        Date now = new Date();

        capitalAccount.setCreatedTime(now);
        capitalAccountMapper.insertSelective(capitalAccount);

        CapitalAccountFlow capitalAccountFlow = new CapitalAccountFlow();
        capitalAccountFlow.setAccountId(capitalAccount.getId());
        capitalAccountFlow.setFlowType(AccountFlowTypeEnum.INCOME.getType());
        capitalAccountFlow.setIncome(capitalAccount.getAmount());
        capitalAccountFlow.setExpense(BigDecimal.ZERO);
        capitalAccountFlow.setBalanceAmount(capitalAccount.getAmount());
        capitalAccountFlow.setState(CommonState.NORMAL.getState());
        capitalAccountFlow.setLoanId(capitalAccount.getLoanId());
        capitalAccountFlow.setLoanName(capitalAccount.getLoanName());
        capitalAccountFlow.setCreatedTime(now);
        capitalAccountFlow.setRemark("新借款");
        capitalAccountFlowMapper.insertSelective(capitalAccountFlow);

        serviceResult.setSuccess(true);
        serviceResult.setValue(capitalAccount);
        return serviceResult;
    }

    @Override
    public ServiceResult<CapitalAccount> findOne(Long id, String appKey, String sign) {
        logger.debug("get account by id:[{}]", id);
        ServiceResult<CapitalAccount> serviceResult = new ServiceResult<CapitalAccount>();
        if(!checkSign(id, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        CapitalAccount ca = capitalAccountMapper.selectByPrimaryKey(id);
        if(ca == null){
            logger.error("get account by id:[{}], not exists!", id);
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.BAD_REQUEST.value());
            serviceResult.setErrorMessage("account not exists for id" + id);
            return serviceResult;
        }
        serviceResult.setSuccess(true);
        serviceResult.setValue(ca);
        return serviceResult;
    }

    @Override
    public ServiceResult<List<CapitalAccount>> listUserAccount(Long userId, String appKey, String sign) {
        logger.debug("list account by userId:[{}]", userId);
        ServiceResult<List<CapitalAccount>> serviceResult = new ServiceResult<List<CapitalAccount>>();
        if(!checkSign(userId, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        CapitalAccountExample cae = new CapitalAccountExample();
        CapitalAccountExample.Criteria criteria = cae.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<CapitalAccount> accountList = capitalAccountMapper.selectByExample(cae);
        serviceResult.setSuccess(true);
        serviceResult.setValue(accountList);
        return serviceResult;
    }

    @Override
    public ServiceResult<CapitalAccount> updateAccount(CapitalAccount capitalAccount, String appKey, String sign) {
        logger.debug("update account common info,but not critical info, account:[{}]", capitalAccount);
        ServiceResult<CapitalAccount> serviceResult = new ServiceResult<CapitalAccount>();
        if(!checkSign(capitalAccount, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        if(capitalAccount == null || StringUtils.isEmpty(capitalAccount.getId())){
            logger.error("update account,but id is empty!");
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.BAD_REQUEST.value());
            serviceResult.setErrorMessage("id needed,but empty.");
            return serviceResult;
        }
        CapitalAccount capitalAccountTemp = new CapitalAccount();
        capitalAccountTemp.setState(capitalAccount.getState());
        capitalAccountTemp.setId(capitalAccount.getId());
        capitalAccountMapper.updateByPrimaryKeySelective(capitalAccountTemp);
        capitalAccountTemp = capitalAccountMapper.selectByPrimaryKey(capitalAccount.getId());
        serviceResult.setSuccess(true);
        serviceResult.setValue(capitalAccountTemp);

        return serviceResult;
    }
}
