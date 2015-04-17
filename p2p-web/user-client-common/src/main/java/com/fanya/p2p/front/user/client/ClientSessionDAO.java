package com.fanya.p2p.front.user.client;

import net.spy.memcached.MemcachedClient;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Collection;


public class ClientSessionDAO extends CachingSessionDAO {

    private static final Logger logger = LoggerFactory.getLogger(ClientSessionDAO.class);

    private MemcachedClient memcachedClient;

    private String appKey;

    private int timeout = 3600;

    public void setMemcachedClient(MemcachedClient memcachedClient) {
        this.memcachedClient = memcachedClient;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    protected void doDelete(Session session) {
        if (session == null) {
            throw new NullPointerException("session argument cannot be null.");
        }

        Serializable sessionId = session.getId();
        if (sessionId != null) {
            memcachedClient.delete(sessionId.toString());
        }
    }

    @Override
    protected void doUpdate(Session session) {
        if (session == null) {
            throw new NullPointerException("session argument cannot be null.");
        }

        Serializable sessionId = session.getId();
        if (sessionId != null) {
            memcachedClient.replace(sessionId.toString(), timeout, session);
            // logger.info("update session {}", sessionId);
        }
    }


    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);

        Assert.notNull(sessionId, "id argument cannot be null.");
        assignSessionId(session, sessionId);

        memcachedClient.add(sessionId.toString(), timeout, session);
        logger.info("add session {}", sessionId);

        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        return sessionId == null ? null : (Session) memcachedClient.get(sessionId.toString());
    }

    @Override
    public Collection<Session> getActiveSessions() {
        return null;
    }
}
