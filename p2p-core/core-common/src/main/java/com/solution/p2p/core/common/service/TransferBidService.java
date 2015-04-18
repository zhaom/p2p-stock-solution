package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.TransferBid;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.common.vo.TransferBidQueryParams;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 上午9:47
 * To change this template use File | Settings | File Templates.
 */
public interface TransferBidService {

    ServiceResult<List<TransferBid>> listTransferBid(TransferBidQueryParams transferBidQueryParams, int pageIndex, int pageSize, String appKey, String signature);

    ServiceResult<TransferBid> getTransferBid(Long id, String appKey, String signature);

}
