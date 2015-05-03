package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-12
 * Time: 下午9:46
 * To change this template use File | Settings | File Templates.
 */
public interface MemberService {

    ServiceResult<Integer> createUser(Member member, String appKey, String signature);

    ServiceResult<Member> findByUsername(String content, String appKey, String signature);

    ServiceResult<Integer> resetPassword(Long mid, String oldPassword, String newPassword, String appKey, String signature);

    ServiceResult<Integer> resetTradePassword(Long mid, String oldPassword, String newPassword, String appKey, String signature);
}
