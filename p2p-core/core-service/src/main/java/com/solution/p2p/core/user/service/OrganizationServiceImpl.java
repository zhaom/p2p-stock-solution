package com.solution.p2p.core.user.service;


import com.solution.p2p.core.common.entity.SysOrganization;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.OrganizationService;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysOrganizationMapper;

import java.util.List;

public class OrganizationServiceImpl extends BasicServiceImpl implements OrganizationService {

    private SysOrganizationMapper sysOrganizationMapper;

    public void setSysOrganizationMapper(SysOrganizationMapper sysOrganizationMapper) {
        this.sysOrganizationMapper = sysOrganizationMapper;
    }

    @Override
    public ServiceResult<SysOrganization> createOrganization(SysOrganization sysOrganization, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysOrganization> updateOrganization(SysOrganization sysOrganization, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> deleteOrganization(Long aLong, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    @Override
    public ServiceResult<SysOrganization> findOne(Long aLong, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysOrganization>> findAll(String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> findAllWithExclude(SysOrganization sysOrganization, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysOrganization> move(SysOrganization sysOrganization, SysOrganization sysOrganization2, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }
}
