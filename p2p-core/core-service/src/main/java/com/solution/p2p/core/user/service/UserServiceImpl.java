package com.solution.p2p.core.user.service;

import com.solution.p2p.core.common.entity.*;
import com.solution.p2p.core.common.service.AccountService;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.PasswordHelper;
import com.solution.p2p.core.common.service.UserService;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.common.utils.UserIdentificationTypeEnum;
import com.solution.p2p.core.common.utils.UserSecurityAuthResultEnum;
import com.solution.p2p.core.common.utils.UserSecurityAuthTypeEnum;
import com.solution.p2p.core.user.dao.SysUserIdentificationMapper;
import com.solution.p2p.core.user.dao.SysUserMapper;
import com.solution.p2p.core.user.dao.SysUserSecurityMapper;

import java.util.Date;
import java.util.List;

public class UserServiceImpl extends BasicServiceImpl implements UserService {

    private SysUserMapper sysUserMapper;

    private SysUserSecurityMapper sysUserSecurityMapper;

    private SysUserIdentificationMapper sysUserIdentificationMapper;

    private PasswordHelper passwordHelper;

    private AccountService accountService;

    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    public void setSysUserSecurityMapper(SysUserSecurityMapper sysUserSecurityMapper) {
        this.sysUserSecurityMapper = sysUserSecurityMapper;
    }

    public void setSysUserIdentificationMapper(SysUserIdentificationMapper sysUserIdentificationMapper) {
        this.sysUserIdentificationMapper = sysUserIdentificationMapper;
    }

    public void setPasswordHelper(PasswordHelper passwordHelper) {
        this.passwordHelper = passwordHelper;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public ServiceResult<SysUser> createUser(SysUser sysUser, String appKey, String sign) {
        ServiceResult<SysUser> serviceResult = new ServiceResult<SysUser>();
        if(!checkSign(sysUser, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        passwordHelper.encryptPassword(sysUser);
        sysUserMapper.insertSelective(sysUser);

        SysUserSecurity sysUserSecurity = new SysUserSecurity();
        sysUserSecurity.setUserId(sysUser.getId());
        sysUserSecurity.setAuthType(UserSecurityAuthTypeEnum.LOGIN_PASSWD.getAuthType());
        sysUserSecurity.setAuthName(UserSecurityAuthTypeEnum.LOGIN_PASSWD.getAuthName());
        sysUserSecurity.setAuthDesc(UserSecurityAuthTypeEnum.LOGIN_PASSWD.getAuthDesc());
        sysUserSecurity.setAuthResult(UserSecurityAuthResultEnum.SETTED.getDesc());
        sysUserSecurity.setCreatedTime(new Date());
        sysUserSecurity.setLastUpdateTime(new Date());
        sysUserSecurityMapper.insertSelective(sysUserSecurity);

        SysUserIdentification sysUserIdentification = new SysUserIdentification();
        sysUserIdentification.setUserId(sysUser.getId());
        sysUserIdentification.setIdenType(UserIdentificationTypeEnum.MOBILE.getIdType());
        sysUserIdentification.setIdenName(UserIdentificationTypeEnum.MOBILE.getIdName());
        sysUserIdentification.setPropValue(sysUser.getMobile());
        sysUserIdentificationMapper.insertSelective(sysUserIdentification);

        ServiceResult<List<CapitalAccount>> serviceResult1 = accountService.initUserAccount(sysUser.getId(), sysUser.getUsername(), appKey, getSign(sysUser.getId(), appKey));
        if(serviceResult1.isSuccess()){
            serviceResult.setSuccess(true);
            serviceResult.setValue(sysUser);
        } else {
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(serviceResult1.getErrorCode());
            serviceResult.setErrorMessage(serviceResult1.getErrorMessage());
        }
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUser> updateUser(SysUser sysUser, String appKey, String sign) {
        ServiceResult<SysUser> serviceResult = new ServiceResult<SysUser>();
        if(!checkSign(sysUser, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
        SysUser user = sysUserMapper.selectByPrimaryKey(sysUser.getId());
        serviceResult.setSuccess(true);
        serviceResult.setValue(user);
        return serviceResult;
    }

    @Override
    public ServiceResult<Object> deleteUser(Long aLong, String appKey, String sign) {
        ServiceResult<Object> serviceResult = new ServiceResult<Object>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserMapper.deleteByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        return serviceResult;
    }

    @Override
    public ServiceResult<Object> changePassword(Long aLong, String s, String appKey, String sign) {
        ServiceResult<Object> serviceResult = new ServiceResult<Object>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(aLong);
        sysUser.setPassword(s);
        passwordHelper.encryptPassword(sysUser);
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
        serviceResult.setSuccess(true);
        return serviceResult;
    }

    @Override
    public ServiceResult<Object> resetPassword(String userName, String newPasswd, String appKey, String sign) {
        ServiceResult<Object> serviceResult = new ServiceResult<Object>();
        if(!checkSign(userName, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        ServiceResult<SysUser> sysUserServiceResult = this.findByUsername(userName,appKey,getSign(userName,appKey));
        if(sysUserServiceResult.isSuccess()){
            SysUser sysUser = sysUserServiceResult.getValue();
            sysUser.setPassword(newPasswd);
            passwordHelper.encryptPassword(sysUser);
            sysUserMapper.updateByPrimaryKeySelective(sysUser);
            serviceResult.setSuccess(true);
            return serviceResult;
        }
        serviceResult.setSuccess(false);
        serviceResult.setErrorCode(sysUserServiceResult.getErrorCode());
        serviceResult.setErrorMessage(sysUserServiceResult.getErrorMessage());
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUser> findOne(Long aLong, String appKey, String sign) {
        ServiceResult<SysUser> serviceResult = new ServiceResult<SysUser>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUser);
        return serviceResult;
    }

    @Override
    public ServiceResult<List<SysUser>> findAll(String appKey, String sign) {
        ServiceResult<List<SysUser>> serviceResult = new ServiceResult<List<SysUser>>();
        if(!checkSign(null, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        List<SysUser> userList = sysUserMapper.selectByExample(null);
        serviceResult.setSuccess(true);
        serviceResult.setValue(userList);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUser> findByUsername(String userName, String appKey, String sign) {
        ServiceResult<SysUser> serviceResult = new ServiceResult<SysUser>();
        if(!checkSign(userName, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserExample sysUserExample = new SysUserExample();

        SysUserExample.Criteria criteriaUsername = sysUserExample.createCriteria();
        criteriaUsername.andUsernameEqualTo(userName);

        sysUserExample.or(criteriaUsername);

        SysUserExample.Criteria criteriaEmail = sysUserExample.createCriteria();
        criteriaEmail.andEmailEqualTo(userName);

        sysUserExample.or(criteriaEmail);

        SysUserExample.Criteria criteriaMobile = sysUserExample.createCriteria();
        criteriaMobile.andMobileEqualTo(userName);

        sysUserExample.or(criteriaMobile);

        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        if(sysUserList == null || sysUserList.size() < 1){
            logger.debug("find by User name [{}], but not find", userName);
            serviceResult.setSuccess(true);
            return serviceResult;
        }
        else{
            logger.debug("finded by User name [{}]", userName);
            SysUser sysUser = sysUserList.get(0);
            serviceResult.setSuccess(true);
            serviceResult.setValue(sysUser);
            return serviceResult;
        }
    }
}
