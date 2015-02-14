package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.SysUserIdentification;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-22
 * Time: 上午11:37
 * To change this template use File | Settings | File Templates.
 */
public interface UserIdentificationService {

    public ServiceResult<SysUserIdentification> createUserIdentification(SysUserIdentification sysUserIdentification, String appKey, String sign);

    public ServiceResult<SysUserIdentification> findOne(Long id, String appKey, String sign);

    public ServiceResult<SysUserIdentification> updateUserIdentification(SysUserIdentification sysUserIdentification, String appKey, String sign);

    public ServiceResult<SysUserIdentification> deleteOne(Long id, String appKey, String sign);

    public ServiceResult<List<SysUserIdentification>> findByUserId(Long userId, String appKey, String sign);
}
