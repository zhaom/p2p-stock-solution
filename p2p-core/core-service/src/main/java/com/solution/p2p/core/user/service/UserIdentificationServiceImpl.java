package com.solution.p2p.core.user.service;

import com.solution.p2p.core.common.entity.SysUserIdentification;
import com.solution.p2p.core.common.entity.SysUserIdentificationExample;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.UserIdentificationService;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysUserIdentificationMapper;

import java.util.List;


public class UserIdentificationServiceImpl extends BasicServiceImpl implements UserIdentificationService {

    private SysUserIdentificationMapper sysUserIdentificationMapper;

    public void setSysUserIdentificationMapper(SysUserIdentificationMapper sysUserIdentificationMapper) {
        this.sysUserIdentificationMapper = sysUserIdentificationMapper;
    }

    @Override
    public ServiceResult<SysUserIdentification> createUserIdentification(SysUserIdentification sysUserIdentification, String appKey, String sign) {
        ServiceResult<SysUserIdentification> serviceResult = new ServiceResult<SysUserIdentification>();
        if(!checkSign(sysUserIdentification, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserIdentificationMapper.insertSelective(sysUserIdentification);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserIdentification);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserIdentification> findOne(Long aLong, String appKey, String sign) {
        ServiceResult<SysUserIdentification> serviceResult = new ServiceResult<SysUserIdentification>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserIdentification sui = sysUserIdentificationMapper.selectByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sui);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserIdentification> updateUserIdentification(SysUserIdentification sysUserIdentification, String appKey, String sign) {
        ServiceResult<SysUserIdentification> serviceResult = new ServiceResult<SysUserIdentification>();
        if(!checkSign(sysUserIdentification, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserIdentificationMapper.updateByPrimaryKeySelective(sysUserIdentification);
        SysUserIdentification sui = sysUserIdentificationMapper.selectByPrimaryKey(sysUserIdentification.getId());
        serviceResult.setSuccess(true);
        serviceResult.setValue(sui);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserIdentification> deleteOne(Long aLong, String appKey, String sign) {
        ServiceResult<SysUserIdentification> serviceResult = new ServiceResult<SysUserIdentification>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserIdentification sysUserIdentification = sysUserIdentificationMapper.selectByPrimaryKey(aLong);
        sysUserIdentificationMapper.deleteByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserIdentification);
        return serviceResult;
    }

    @Override
    public ServiceResult<List<SysUserIdentification>>  findByUserId(Long aLong, String appKey, String sign) {
        ServiceResult<List<SysUserIdentification>> serviceResult = new ServiceResult<List<SysUserIdentification>>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserIdentificationExample sysUserIdentificationExample = new SysUserIdentificationExample();
        SysUserIdentificationExample.Criteria criteria = sysUserIdentificationExample.createCriteria();
        criteria.andUserIdEqualTo(aLong);

        List<SysUserIdentification> suiList = sysUserIdentificationMapper.selectByExample(sysUserIdentificationExample);
        serviceResult.setSuccess(true);
        serviceResult.setValue(suiList);
        return serviceResult;
    }
}
