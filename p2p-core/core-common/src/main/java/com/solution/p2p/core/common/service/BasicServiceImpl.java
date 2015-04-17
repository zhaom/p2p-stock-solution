package com.solution.p2p.core.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-5
 * Time: 下午3:57
 * To change this template use File | Settings | File Templates.
 */
public class BasicServiceImpl {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    private boolean isServiceSign = false;

    private SignService signService;

    public void setSignService(SignService signService) {
        this.signService = signService;
    }

    protected boolean checkSign(Object p, String appKey, String sign){
        return signService.checkSign(p, appKey, sign);
    }

    protected String getSign(Object p, String appKey){
        return signService.getSign(p, appKey);
    }

}
