package com.solution.p2p.core.user.service;

import com.solution.p2p.core.common.entity.SysBiz;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.BizService;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.user.dao.SysBizMapper;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-9
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class BizServiceImpl extends BasicServiceImpl implements BizService {

    private SysBizMapper sysBizMapper;

    public void setSysBizMapper(SysBizMapper sysBizMapper) {
        this.sysBizMapper = sysBizMapper;
    }

    @Override
    public ServiceResult<SysBiz> createBiz(SysBiz sysBiz, String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysBiz> updateBiz(SysBiz sysBiz, SysBiz sysBiz2, String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysBiz> findOne(Long aLong, String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Pagination<SysBiz>> find(SysBiz sysBiz, String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
