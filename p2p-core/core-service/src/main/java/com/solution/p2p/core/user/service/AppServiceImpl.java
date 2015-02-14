package com.solution.p2p.core.user.service;




import com.solution.p2p.core.common.entity.SysApp;
import com.solution.p2p.core.common.entity.SysAppExample;
import com.solution.p2p.core.common.service.AppService;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysAppMapper;

import java.util.List;

public class AppServiceImpl extends BasicServiceImpl implements AppService {

    private SysAppMapper sysAppMapper;

    public void setSysAppMapper(SysAppMapper sysAppMapper) {
        this.sysAppMapper = sysAppMapper;
    }

    @Override
    public ServiceResult<SysApp> createApp(SysApp sysApp, String appKey, String sign) {
        ServiceResult<SysApp> serviceResult = new ServiceResult<SysApp>();
        if(!checkSign(sysApp, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysAppMapper.insertSelective(sysApp);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysApp);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysApp> updateApp(SysApp sysApp, String appKey, String sign) {
        ServiceResult<SysApp> serviceResult = new ServiceResult<SysApp>();
        if(!checkSign(sysApp, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysAppMapper.updateByPrimaryKeySelective(sysApp);
        SysApp app = sysAppMapper.selectByPrimaryKey(sysApp.getId());
        serviceResult.setSuccess(true);
        serviceResult.setValue(app);
        return serviceResult;
    }

    @Override
    public ServiceResult<Object> deleteApp(Long appId, String appKey, String sign) {
        ServiceResult<Object> serviceResult = new ServiceResult<Object>();
        if(!checkSign(null, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        serviceResult.setSuccess(true);
        serviceResult.setValue(appId);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysApp> findOne(Long appId, String appKey, String sign) {
        ServiceResult<SysApp> serviceResult = new ServiceResult<SysApp>();
        if(!checkSign(null, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysApp app = sysAppMapper.selectByPrimaryKey(appId);
        serviceResult.setSuccess(true);
        serviceResult.setValue(app);
        return serviceResult;
    }

    @Override
    public ServiceResult<List<SysApp>> findAll(String appKey, String sign) {
        ServiceResult<List<SysApp>> serviceResult = new ServiceResult<List<SysApp>>();
        if(!checkSign(null, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        List<SysApp> appList = sysAppMapper.selectByExample(null);
        serviceResult.setSuccess(true);
        serviceResult.setValue(appList);
        return serviceResult;
    }

    @Override
    public ServiceResult<Long> findAppIdByAppKey(String tAppKey, String appKey, String sign) {
        ServiceResult<Long> serviceResult = new ServiceResult<Long>();
        if(!checkSign(tAppKey, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysAppExample sysAppExample = new SysAppExample();
        SysAppExample.Criteria criteria = sysAppExample.createCriteria();
        criteria.andAppKeyEqualTo(tAppKey);

        List<SysApp> sysAppList = sysAppMapper.selectByExample(sysAppExample);
        if(sysAppList != null && sysAppList.size() == 1) {
            serviceResult.setSuccess(true);
            serviceResult.setValue(sysAppList.get(0).getId());
            return serviceResult;
        }
        serviceResult.setSuccess(false);
        serviceResult.setErrorCode(556);
        serviceResult.setErrorMessage("value in db exception.");
        return serviceResult;
    }
}
