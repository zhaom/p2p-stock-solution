package com.solution.p2p.core.user.service;


import com.solution.p2p.core.common.entity.SysApp;
import com.solution.p2p.core.common.entity.SysAppExample;
import com.solution.p2p.core.common.service.SignService;
import com.solution.p2p.core.common.utils.SignUtil;
import com.solution.p2p.core.user.dao.SysAppMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-5
 * Time: 下午3:29
 * To change this template use File | Settings | File Templates.
 */
public class SignServiceImpl implements SignService {

    private static Map<Long, Map<String, String>> appMap = new ConcurrentHashMap<Long, Map<String, String>>(1);

    static {
        appMap.put(1L, new ConcurrentHashMap<String, String>());
    }

    private SysAppMapper sysAppMapper;

    public void setSysAppMapper(SysAppMapper sysAppMapper) {
        this.sysAppMapper = sysAppMapper;
    }


    public String getSecretByKey(String appKey){
        Long currentTime = System.currentTimeMillis();

        Long lastCacheKey = appMap.keySet().iterator().next();

        if(currentTime > lastCacheKey + 10 * 60 * 60 * 1000 || appMap.get(lastCacheKey).size() < 1){
            synchronized (this){
                if(currentTime > lastCacheKey + 10 * 60 * 60 * 1000 || appMap.get(lastCacheKey).size() < 1){
                    SysAppExample sysAppExample = new SysAppExample();
                    SysAppExample.Criteria criteria = sysAppExample.createCriteria();
                    criteria.andAvailableEqualTo(true);
                    List<SysApp> appList = sysAppMapper.selectByExample(sysAppExample);
                    Map<String, String> map = new ConcurrentHashMap<String, String>();
                    for(SysApp app:appList){
                        map.put(app.getAppKey(), app.getAppSecret());
                    }
                    appMap.clear();
                    appMap.put(currentTime,map);
                    lastCacheKey = currentTime;
                }
            }
        }
        return appMap.get(lastCacheKey).get(appKey);
    }

    @Override
    public boolean checkSign(Object params, String appKey, String sign) {
        return SignUtil.checkParamsSign(params, appKey, getSecretByKey(appKey), sign);
    }

    @Override
    public String getSign(Object params, String appKey) {
        return SignUtil.signParams(params, appKey, getSecretByKey(appKey));
    }
}
