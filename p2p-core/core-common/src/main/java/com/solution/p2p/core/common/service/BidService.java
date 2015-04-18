package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.Bid;
import com.solution.p2p.core.common.utils.Pagination;
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

    /**
     * 分页列出满足条件的标
     * @param bidQueryParams
     * @param pageIndex
     * @param pageSize
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Pagination<Bid>> listBid(BidQueryParams bidQueryParams, int pageIndex, int pageSize, String appKey, String signature);

    /**
     * 查询单个标的详情
     * @param id
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Bid> getBid(Long id, String appKey, String signature);



}
