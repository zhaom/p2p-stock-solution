package com.solution.p2p.core.common.service;



import com.solution.p2p.core.common.entity.SysUser;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;


public interface UserService {

    public ServiceResult<SysUser> createUser(SysUser user, String appKey, String sign);

    public ServiceResult<SysUser> updateUser(SysUser user, String appKey, String sign);

    public ServiceResult<Object> deleteUser(Long userId, String appKey, String sign);

    public ServiceResult<Object> changePassword(Long userId, String newPassword, String appKey, String sign);

    public ServiceResult<Object> resetPassword(String mobile, String newPassword, String appKey, String sign);

    public ServiceResult<SysUser> findOne(Long userId, String appKey, String sign);

    public ServiceResult<List<SysUser>> findAll(String appKey, String sign);

    public ServiceResult<SysUser> findByUsername(String username, String appKey, String sign);

}
