package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.CapitalAccountFlow;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public interface AccountFlowService {

    public ServiceResult<List<CapitalAccountFlow>> listAccountFlow(Long accountId, String appKey, String sign);

}
