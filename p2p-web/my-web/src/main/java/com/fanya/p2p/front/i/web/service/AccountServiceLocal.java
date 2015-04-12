package com.fanya.p2p.front.i.web.service;

import com.fanya.p2p.front.i.web.utils.Constants;
import com.solution.p2p.core.common.entity.MemberAccount;
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


    public MemberAccount createAccountByInvest(MemberAccount memberAccount) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public MemberAccount createAccountByLoan(MemberAccount capitalAccount) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public MemberAccount findOne(Long aLong) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<MemberAccount> listUserAccount(Long userId) {
        ServiceResult<List<MemberAccount>> serviceResult = accountService.listUserAccount(userId, Constants.APP_KEY, SignUtil.signParams(userId, Constants.APP_KEY, Constants.APP_SECURITY));
        return serviceResult.getValue();
    }


    public MemberAccount updateAccount(MemberAccount capitalAccount) {
        return null;
    }
}
