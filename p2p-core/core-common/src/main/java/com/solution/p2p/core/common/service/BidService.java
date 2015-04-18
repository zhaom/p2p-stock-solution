package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.Bid;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.common.vo.BidQueryParams;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 上午7:53
 * To change this template use File | Settings | File Templates.
 */
public interface BidService {

    ServiceResult<List<Bid>> listBid(BidQueryParams bidQueryParams, int pageIndex, int pageSize, String appKey, String signature);

    ServiceResult<Bid> getBid(Long id, String appKey, String signature);

}
