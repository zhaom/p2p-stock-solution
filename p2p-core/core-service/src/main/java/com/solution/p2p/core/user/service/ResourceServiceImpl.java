package com.solution.p2p.core.user.service;


import com.solution.p2p.core.common.entity.SysResource;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.ResourceService;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysResourceMapper;

import java.util.List;
import java.util.Set;

public class ResourceServiceImpl extends BasicServiceImpl implements ResourceService {

    private SysResourceMapper sysResourceMapper;

    public void setSysResourceMapper(SysResourceMapper sysResourceMapper) {
        this.sysResourceMapper = sysResourceMapper;
    }

    @Override
    public ServiceResult<SysResource> createResource(SysResource sysResource, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysResource> updateResource(SysResource sysResource, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> deleteResource(Long aLong, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    @Override
    public ServiceResult<SysResource> findOne(Long aLong, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysResource>> findAll(String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Set<String>> findPermissions(Set<Long> longs, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysResource>> findMenus(Set<String> strings, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
