package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.SysUserAppRoles;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;
import java.util.Set;


public interface AuthorizationService {

    public ServiceResult<SysUserAppRoles> createAuthorization(SysUserAppRoles authorization, String appKey, String sign);

    public ServiceResult<SysUserAppRoles> updateAuthorization(SysUserAppRoles authorization, String appKey, String sign);

    public ServiceResult<Object> deleteAuthorization(Long authorizationId, String appKey, String sign);

    public ServiceResult<SysUserAppRoles> findOne(Long authorizationId, String appKey, String sign);

    public ServiceResult<List<SysUserAppRoles>> findAll(String appKey, String sign);

    public ServiceResult<Set<String>> findRoles(String tAppKey, String username, String appKey, String sign);

    public ServiceResult<Set<String>> findPermissions(String tAppKey, String username, String appKey, String sign);

}
