package com.fanya.p2p.front.user.client;

import com.fanya.p2p.common.remote.RemoteServiceInterface;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;

import java.io.Serializable;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-3-13
 * <p>Version: 1.0
 */
public class ClientSessionDAO extends CachingSessionDAO {

    private RemoteServiceInterface remoteService;
    private String appKey;

    public void setRemoteService(RemoteServiceInterface remoteService) {
        this.remoteService = remoteService;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }


    @Override
    protected void doDelete(Session session) {
        remoteService.deleteSession(appKey, session);
    }

    @Override
    protected void doUpdate(Session session) {
        remoteService.updateSession(appKey, session);
    }


    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = remoteService.createSession(session);
        assignSessionId(session, sessionId);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        return remoteService.getSession(appKey, sessionId);
    }
}
