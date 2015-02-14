package com.solution.p2p.core.user.service;

import com.solution.p2p.core.common.entity.SysUser;
import com.solution.p2p.core.common.entity.SysUserAppRoles;
import com.solution.p2p.core.common.entity.SysUserAppRolesExample;
import com.solution.p2p.core.common.service.*;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysUserAppRolesMapper;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AuthorizationServiceImpl extends BasicServiceImpl implements AuthorizationService {

    private SysUserAppRolesMapper sysUserAppRolesMapper;

    private UserService userService;

    private AppService appService;

    private RoleService roleService;

    public void setSysUserAppRolesMapper(SysUserAppRolesMapper sysUserAppRolesMapper) {
        this.sysUserAppRolesMapper = sysUserAppRolesMapper;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setAppService(AppService appService) {
        this.appService = appService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public ServiceResult<SysUserAppRoles> createAuthorization(SysUserAppRoles sysUserAppRoles, String appKey, String sign) {
        ServiceResult<SysUserAppRoles> serviceResult = new ServiceResult<SysUserAppRoles>();
        if(!checkSign(sysUserAppRoles, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserAppRolesMapper.insertSelective(sysUserAppRoles);
        serviceResult.setValue(sysUserAppRoles);
        serviceResult.setSuccess(true);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserAppRoles> updateAuthorization(SysUserAppRoles sysUserAppRoles, String appKey, String sign) {
        ServiceResult<SysUserAppRoles> serviceResult = new ServiceResult<SysUserAppRoles>();
        if(!checkSign(sysUserAppRoles, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserAppRolesMapper.updateByPrimaryKeySelective(sysUserAppRoles);
        SysUserAppRoles sysUserAppRoles1 = sysUserAppRolesMapper.selectByPrimaryKey(sysUserAppRoles.getId());
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserAppRoles1);
        return serviceResult;
    }

    @Override
    public ServiceResult<Object> deleteAuthorization(Long aLong, String appKey, String sign) {
        ServiceResult<Object> serviceResult = new ServiceResult<Object>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserAppRolesMapper.deleteByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserAppRoles> findOne(Long aLong, String appKey, String sign) {
        ServiceResult<SysUserAppRoles> serviceResult = new ServiceResult<SysUserAppRoles>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserAppRoles sysUserAppRoles = sysUserAppRolesMapper.selectByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserAppRoles);
        return serviceResult;
    }

    @Override
    public ServiceResult<List<SysUserAppRoles>> findAll(String appKey, String sign) {
        ServiceResult<List<SysUserAppRoles>> serviceResult = new ServiceResult<List<SysUserAppRoles>>();
        if(!checkSign(null, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        List<SysUserAppRoles> sysUserAppRolesList = sysUserAppRolesMapper.selectByExample(null);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserAppRolesList);
        return serviceResult;
    }

    @Override
    public ServiceResult<Set<String>> findRoles(String tAppKey, String username, String appKey, String sign) {
        ServiceResult<Set<String>> serviceResult = new  ServiceResult<Set<String>>();
        if(!checkSign(tAppKey, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        ServiceResult<SysUser> userServiceResult = userService.findByUsername(username, appKey, getSign(username, appKey));
        if(userServiceResult.isSuccess() || userServiceResult.getValue() == null) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(Collections.EMPTY_SET);
            return serviceResult;
        }
        Long appId = appService.findAppIdByAppKey(tAppKey, appKey, getSign(tAppKey, appKey)).getValue();
        if(appId == null) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(Collections.EMPTY_SET);
            return serviceResult;
        }
        SysUserAppRolesExample sysUserAppRolesExample = new SysUserAppRolesExample();
        SysUserAppRolesExample.Criteria criteria = sysUserAppRolesExample.createCriteria();
        criteria.andAppIdEqualTo(appId);
        criteria.andUserIdEqualTo(userServiceResult.getValue().getId());
        List<SysUserAppRoles> authorization = sysUserAppRolesMapper.selectByExample(sysUserAppRolesExample);
        if(authorization == null || authorization.size() != 1) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(Collections.EMPTY_SET);
            return serviceResult;
        }
        String roleIds = authorization.get(0).getRoleIds();
        String[] roleIdArray = roleIds.split(",");
        Long[] roleIdT = new Long[roleIdArray.length];
        for(int i=0;i<roleIdArray.length;i++){
            roleIdT[i] = new Long(roleIdArray[i]);
        }
        return roleService.findRoles(roleIdT, appKey, getSign(roleIdT, appKey));
    }

    @Override
    public ServiceResult<Set<String>> findPermissions(String tAppKey, String username, String appKey, String sign) {
        ServiceResult<Set<String>> serviceResult = new  ServiceResult<Set<String>>();
        if(!checkSign(tAppKey, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        ServiceResult<SysUser> userServiceResult = userService.findByUsername(username, appKey, getSign(username, appKey));
        if(userServiceResult.isSuccess() || userServiceResult.getValue() == null) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(Collections.EMPTY_SET);
            return serviceResult;
        }
        Long appId = appService.findAppIdByAppKey(tAppKey, appKey, getSign(tAppKey, appKey)).getValue();
        if(appId == null) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(Collections.EMPTY_SET);
            return serviceResult;
        }
        SysUserAppRolesExample sysUserAppRolesExample = new SysUserAppRolesExample();
        SysUserAppRolesExample.Criteria criteria = sysUserAppRolesExample.createCriteria();
        criteria.andAppIdEqualTo(appId);
        criteria.andUserIdEqualTo(userServiceResult.getValue().getId());
        List<SysUserAppRoles> authorization = sysUserAppRolesMapper.selectByExample(sysUserAppRolesExample);
        if(authorization == null || authorization.size() != 1) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(Collections.EMPTY_SET);
            return serviceResult;
        }
        String roleIds = authorization.get(0).getRoleIds();
        String[] roleIdArray = roleIds.split(",");
        Long[] roleIdT = new Long[roleIdArray.length];
        for(int i=0;i<roleIdArray.length;i++){
            roleIdT[i] = new Long(roleIdArray[i]);
        }
        return roleService.findPermissions(roleIdT, appKey, getSign(roleIdT, appKey));
    }
}
