package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.SysMsg;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 上午7:41
 * To change this template use File | Settings | File Templates.
 */
public interface SysMsgService {

    ServiceResult<List<SysMsg>> listMsg(Long uid, Integer type,String appKey, String signature);

    ServiceResult<SysMsg>  readMsg(Long uid, Long id,String appKey, String signature);
}
