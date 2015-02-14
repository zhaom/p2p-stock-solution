package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.CapitalAccount;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 上午11:49
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    public ServiceResult<List<CapitalAccount>> initUserAccount(Long userId, String userName, String appKey, String sign);

    public ServiceResult<CapitalAccount> createAccountByInvest(CapitalAccount capitalAccount, String appKey, String sign);

    public ServiceResult<CapitalAccount> createAccountByLoan(CapitalAccount capitalAccount, String appKey, String sign);

    public ServiceResult<CapitalAccount> findOne(Long id, String appKey, String sign);

    public ServiceResult<List<CapitalAccount>> listUserAccount(Long userId, String appKey, String sign);

    public ServiceResult<CapitalAccount> updateAccount(CapitalAccount capitalAccount, String appKey, String sign);

}
