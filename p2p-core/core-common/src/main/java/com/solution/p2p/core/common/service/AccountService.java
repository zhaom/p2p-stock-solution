package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.MemberAccount;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-12
 * Time: 下午9:41
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    ServiceResult<List<MemberAccount>> listUserAccount(Long userId, String appKey, String s);


}