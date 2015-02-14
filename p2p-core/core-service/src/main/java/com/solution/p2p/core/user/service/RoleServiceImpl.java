package com.solution.p2p.core.user.service;



import com.solution.p2p.core.common.entity.SysRole;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.RoleService;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysRoleMapper;

import java.util.List;
import java.util.Set;

public class RoleServiceImpl extends BasicServiceImpl implements RoleService {

    private SysRoleMapper sysRoleMapper;

    public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
        this.sysRoleMapper = sysRoleMapper;
    }

    @Override
    public ServiceResult<SysRole> createRole(SysRole sysRole, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysRole> updateRole(SysRole sysRole, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> deleteRole(Long aLong, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    @Override
    public ServiceResult<SysRole> findOne(Long aLong, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysRole>> findAll(String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Set<String>> findRoles(Long[] longs, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Set<String>> findPermissions(Long[] longs, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
