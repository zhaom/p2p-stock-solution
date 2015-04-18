package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.MemberBidDistribute;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 下午10:36
 * To change this template use File | Settings | File Templates.
 */
public interface MemberBidDistributeService {

    ServiceResult<Pagination<MemberBidDistribute>> listMBD(MemberBidDistribute memberBidDistribute, String appKey, String signature);
}
