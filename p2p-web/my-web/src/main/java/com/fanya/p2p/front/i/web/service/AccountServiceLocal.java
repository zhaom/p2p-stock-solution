package com.fanya.p2p.front.i.web.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fanya.p2p.front.i.web.utils.Constants;
import com.solution.p2p.core.common.entity.CapitalAccount;
import com.solution.p2p.core.common.service.AccountService;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.common.utils.SignUtil;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-20
 * Time: 下午5:39
 * To change this template use File | Settings | File Templates.
 */
public class AccountServiceLocal  {

    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }


    public CapitalAccount createAccountByInvest(CapitalAccount capitalAccount) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public CapitalAccount createAccountByLoan(CapitalAccount capitalAccount) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public CapitalAccount findOne(Long aLong) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<CapitalAccount> listUserAccount(Long userId) {
        ServiceResult<List<CapitalAccount>> serviceResult = accountService.listUserAccount(userId, Constants.APP_KEY, SignUtil.signParams(userId, Constants.APP_KEY, Constants.APP_SECURITY));
        return serviceResult.getValue();
    }


    public CapitalAccount updateAccount(CapitalAccount capitalAccount) {
        return null;
    }
}
