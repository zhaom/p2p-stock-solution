package com.solution.p2p.core.account.service;


import com.solution.p2p.core.account.dao.CapitalAccountBankcardMapper;
import com.solution.p2p.core.account.dao.CapitalAccountMapper;
import com.solution.p2p.core.common.entity.CapitalAccount;
import com.solution.p2p.core.common.entity.CapitalAccountBankcard;
import com.solution.p2p.core.common.entity.CapitalAccountBankcardExample;
import com.solution.p2p.core.common.entity.CapitalAccountExample;
import com.solution.p2p.core.common.service.AccountBankcardService;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.utils.AccountCategaryEnum;
import com.solution.p2p.core.common.utils.BankcardTypeEnum;
import com.solution.p2p.core.common.utils.CommonState;
import com.solution.p2p.core.common.utils.ServiceResult;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-9
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
public class AccountBankcardServiceImpl extends BasicServiceImpl implements AccountBankcardService {

    private CapitalAccountBankcardMapper capitalAccountBankcardMapper;

    private CapitalAccountMapper capitalAccountMapper;

    public void setCapitalAccountBankcardMapper(CapitalAccountBankcardMapper capitalAccountBankcardMapper) {
        this.capitalAccountBankcardMapper = capitalAccountBankcardMapper;
    }

    public void setCapitalAccountMapper(CapitalAccountMapper capitalAccountMapper) {
        this.capitalAccountMapper = capitalAccountMapper;
    }

    @Override
    public ServiceResult<CapitalAccountBankcard> getUserMasterCard(Long userId, String appKey, String sign) {
        logger.debug("get master card for user id:[{}]", userId);
        ServiceResult<CapitalAccountBankcard> serviceResult = new ServiceResult<CapitalAccountBankcard>();
        if(!checkSign(userId, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        CapitalAccountBankcardExample capitalAccountBankcardExample = new CapitalAccountBankcardExample();
        CapitalAccountBankcardExample.Criteria criteria = capitalAccountBankcardExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andIsMasterEqualTo(true);
        List<CapitalAccountBankcard> capitalAccountBankcardList = capitalAccountBankcardMapper.selectByExample(capitalAccountBankcardExample);
        if(capitalAccountBankcardList == null || capitalAccountBankcardList.size() < 1){
            logger.debug("user [{}] has no master card.", userId);
            serviceResult.setSuccess(true);
            return serviceResult;
        }else if(capitalAccountBankcardList.size() != 1){
            logger.error("user [{}] has not only one master card.", userId);
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(556);
            serviceResult.setErrorMessage("user master card exception");
            return serviceResult;
        }
        serviceResult.setSuccess(true);
        serviceResult.setValue(capitalAccountBankcardList.get(0));
        return serviceResult;
    }

    @Override
    public ServiceResult<CapitalAccountBankcard> changeCardApply(Long userId, String bankCode, String cardNo, String appKey, String sign) {
        logger.debug("user:[{}] request change card", userId);
        ServiceResult<CapitalAccountBankcard> serviceResult = new ServiceResult<CapitalAccountBankcard>();
        if(!checkSign(userId, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        CapitalAccountBankcard capitalAccountBankcard = null;
        CapitalAccountBankcardExample capitalAccountBankcardExample = new CapitalAccountBankcardExample();
        CapitalAccountBankcardExample.Criteria criteria = capitalAccountBankcardExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andCardNoEqualTo(cardNo);
        criteria.andBankCodeEqualTo(bankCode);
        List<CapitalAccountBankcard> cabList = capitalAccountBankcardMapper.selectByExample(capitalAccountBankcardExample);
        if(cabList == null || cabList.size()<1){
            capitalAccountBankcard = new CapitalAccountBankcard();
            capitalAccountBankcard.setBankCode(bankCode);
            capitalAccountBankcard.setUserId(userId);
            capitalAccountBankcard.setCardNo(cardNo);
            capitalAccountBankcard.setCreatedTime(new Date());
            capitalAccountBankcard.setIsMaster(true);
            capitalAccountBankcard.setState(CommonState.FREEZE.getState());
            capitalAccountBankcard.setCardType(BankcardTypeEnum.DEBIT.getType());
            capitalAccountBankcardMapper.insertSelective(capitalAccountBankcard);
            serviceResult.setSuccess(true);
            serviceResult.setValue(capitalAccountBankcard);
            return serviceResult;
        } else if(cabList.size() == 1){
            capitalAccountBankcard = cabList.get(0);
            capitalAccountBankcard.setIsMaster(true);
            capitalAccountBankcard.setState(CommonState.FREEZE.getState());
            capitalAccountBankcardMapper.updateByPrimaryKeySelective(capitalAccountBankcard);

            serviceResult.setSuccess(true);
            serviceResult.setValue(capitalAccountBankcard);
            return serviceResult;
        } else {
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(556);
            serviceResult.setErrorMessage("user bankcard exception");
            return serviceResult;
        }
    }

    @Override
    public ServiceResult<CapitalAccountBankcard> changeCardConfirm(CapitalAccountBankcard bankcard, String appKey, String sign) {
        logger.debug("confirm user bankcard info, id:[{}]", bankcard.getId());
        ServiceResult<CapitalAccountBankcard> serviceResult = new ServiceResult<CapitalAccountBankcard>();
        if(!checkSign(bankcard, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        if(bankcard.getId() == null
                || bankcard.getId() == 0L
                || bankcard.getUserId() == null
                || bankcard.getUserId() == 0L
                || StringUtils.isEmpty(bankcard.getBankCode())
                || StringUtils.isEmpty(bankcard.getCardNo())){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(HttpStatus.BAD_REQUEST.value());
            serviceResult.setErrorMessage("given value invalid.");
            return serviceResult;
        }
        if(bankcard.getAccountId() == null || bankcard.getAccountId() == 0L){
            CapitalAccountExample capitalAccountExample = new CapitalAccountExample();
            CapitalAccountExample.Criteria criteria = capitalAccountExample.createCriteria();
            criteria.andUserIdEqualTo(bankcard.getUserId());
            criteria.andCategaryEqualTo(AccountCategaryEnum.CASH.getCate());
            List<CapitalAccount> caList = capitalAccountMapper.selectByExample(capitalAccountExample);
            if(caList == null || caList.size() != 1){
                serviceResult.setSuccess(false);
                serviceResult.setErrorCode(556);
                serviceResult.setErrorMessage("user account exception");
                return serviceResult;
            }
            bankcard.setAccountId(caList.get(0).getId());
        }
        bankcard.setIsMaster(true);
        bankcard.setState(CommonState.NORMAL.getState());
        capitalAccountBankcardMapper.updateByPrimaryKeySelective(bankcard);
        serviceResult.setSuccess(true);
        serviceResult.setValue(bankcard);
        return serviceResult;
    }
}
