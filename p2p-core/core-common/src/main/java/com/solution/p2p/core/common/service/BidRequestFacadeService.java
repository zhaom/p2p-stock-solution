package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 下午10:07
 * To change this template use File | Settings | File Templates.
 */
public interface BidRequestFacadeService {

    /**
     * 投标前提是否已经满足
     * @param mId
     * @param bid
     * @param amount
     * @return
     */
    ServiceResult<Integer> preRequest(Long mId, Long bid, Long amount);

    /**
     * 投标，可能触发满标
     * @param mId
     * @param bid
     * @param amount
     * @return
     */
    ServiceResult<Integer> bidRequest(Long mId, Long bid, Long amount);

    /**
     * 分发，可能是自动化job处理，或者是管理员处理
     * @param bid
     * @param mriId
     * @return
     */
    ServiceResult<Integer> bidDistribute(Long bid, Long mriId);

    /**
     * 是否可转让
     * @param mid
     * @param memberBidRequestId
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Integer> preTransferBid(Long mid, Long memberBidRequestId, String appKey, String signature);
}
