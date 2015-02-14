package com.solution.p2p.core.common.service;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-13
 * Time: 上午11:01
 * To change this template use File | Settings | File Templates.
 */
public interface SignService {

    boolean checkSign(Object p, String appKey, String sign);

    String getSign(Object p, String appKey);
}
