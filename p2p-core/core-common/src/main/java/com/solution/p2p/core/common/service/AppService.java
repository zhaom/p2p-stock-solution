package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.SysApp;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;


public interface AppService {

    public ServiceResult<SysApp> createApp(SysApp app, String appKey, String sign);

    public ServiceResult<SysApp> updateApp(SysApp app, String appKey, String sign);

    public ServiceResult<Object> deleteApp(Long appId, String appKey, String sign);

    public ServiceResult<SysApp> findOne(Long appId, String appKey, String sign);

    public ServiceResult<List<SysApp>> findAll(String appKey, String sign);

    public ServiceResult<Long> findAppIdByAppKey(String tAppKey, String appKey, String sign);
}
