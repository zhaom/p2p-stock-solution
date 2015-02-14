package com.fanya.p2p.front.user.remote;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fanya.p2p.common.remote.PermissionContext;
import com.fanya.p2p.common.remote.RemoteServiceInterface;
import com.fanya.p2p.front.user.utils.Constants;
import com.solution.p2p.core.common.service.AuthorizationService;
import com.solution.p2p.core.common.utils.SignUtil;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-3-13
 * <p>Version: 1.0
 */
public class RemoteService implements RemoteServiceInterface {

    @Reference
    private AuthorizationService authorizationService;

    @Autowired
    private SessionDAO sessionDAO;

    @Override
    public Session getSession(String appKey, Serializable sessionId) {
        return sessionDAO.readSession(sessionId);
    }

    @Override
    public Serializable createSession(Session session) {
        return sessionDAO.create(session);
    }

    @Override
    public void updateSession(String appKey, Session session) {
        sessionDAO.update(session);
    }

    @Override
    public void deleteSession(String appKey, Session session) {
        sessionDAO.delete(session);
    }

    @Override
    public PermissionContext getPermissions(String appKey, String username) {
        PermissionContext permissionContext = new PermissionContext();
        permissionContext.setRoles(authorizationService.findRoles(appKey, username, Constants.APP_KEY, SignUtil.signParams(appKey, Constants.APP_KEY, Constants.APP_SECURITY)).getValue());
        permissionContext.setPermissions(authorizationService.findPermissions(appKey, username, Constants.APP_KEY, SignUtil.signParams(appKey, Constants.APP_KEY, Constants.APP_SECURITY)).getValue());
        return permissionContext;
    }
}
