package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.Bid;
import com.solution.p2p.core.common.entity.BidRefundInfo;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
public interface BidFacadeService {

    /**
     * 是否可配资
     * @param mid
     * @param productId
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Integer> preCreateBid(Long mid, Long productId, String appKey, String signature);


    /**
     * 配资申请
     * @param bid
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Bid> createCollectBid(Bid bid, String appKey, String signature);

    /**
     * 配资保证金支付、配资服务费等支付，不处理支付的逻辑，只处理支付时对标的处理
     * @param bid
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Bid> collectPayBid(Bid bid, String appKey, String signature);

    /**
     * 开始募集，处理标，
     * @param bid
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Bid> collectBid(Bid bid, String appKey, String signature);

    /**
     * TODO:关联股票账户，处理标
     * @param bid
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Bid> stockBid(Bid bid, String appKey, String signature);

    /**
     * 还款
     * @param bidRefundInfo
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<BidRefundInfo> refundBid(BidRefundInfo bidRefundInfo, String appKey, String signature);

}
