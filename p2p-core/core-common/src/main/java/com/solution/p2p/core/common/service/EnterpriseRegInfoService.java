package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.EnterpriseRegInfo;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 上午11:28
 * To change this template use File | Settings | File Templates.
 */
public interface EnterpriseRegInfoService {

    ServiceResult<Integer> regEnterpriseInfo(EnterpriseRegInfo enterpriseRegInfo,String appKey, String signature);

    ServiceResult<EnterpriseRegInfo> getEnterpriseRegInfo(Long id,String appKey, String signature);


}
