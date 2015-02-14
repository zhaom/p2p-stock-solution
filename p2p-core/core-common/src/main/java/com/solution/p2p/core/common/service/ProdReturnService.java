package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.ProdReturnFlow;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
public interface ProdReturnService {

    public ServiceResult<Pagination<ProdReturnFlow>> findProdFlow(Long prodId, int pageIndex, int pageSize, String appKey, String sign);

    public ServiceResult<ProdReturnFlow> confirmProdPay(ProdReturnFlow prodReturnFlow, String appKey, String sign);

}
