package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 上午7:13
 * To change this template use File | Settings | File Templates.
 */
public interface StatisticService {

    ServiceResult<Map<String, Object>> allSummary(String appKey, String signature);
}
