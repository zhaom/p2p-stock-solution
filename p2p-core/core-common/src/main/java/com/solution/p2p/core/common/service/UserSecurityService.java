package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.SysUserSecurity;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-22
 * Time: 上午11:41
 * To change this template use File | Settings | File Templates.
 */
public interface UserSecurityService {

    public ServiceResult<SysUserSecurity> createUserSecurity(SysUserSecurity sysUserSecurity, String appKey, String sign);

    public ServiceResult<SysUserSecurity> findOne(Long id, String appKey, String sign);

    public ServiceResult<SysUserSecurity> updateUserSecurity(SysUserSecurity sysUserSecurity, String appKey, String sign);

    public ServiceResult<SysUserSecurity> deleteOne(Long id, String appKey, String sign);

    public ServiceResult<List<SysUserSecurity>> findByUserId(Long userId, String appKey, String sign);
}
