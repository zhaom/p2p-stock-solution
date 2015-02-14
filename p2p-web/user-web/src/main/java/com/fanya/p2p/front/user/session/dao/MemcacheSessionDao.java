/*
 * +------------------------------------------------------------------------------------------------+
 * | Author: Yong.Teng <ty@zhubao.com> 																|
 * |         Zhaoming.He <hzm@zhubao.com> 															|
 * | Copyright @ 2013-2014 zhubao.com Inc.															|
 * +------------------------------------------------------------------------------------------------+
 */
package com.fanya.p2p.front.user.session.dao;

import net.spy.memcached.MemcachedClient;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * @author Yong.Teng <ty@zhuyao.com>
 */
public class MemcacheSessionDao extends AbstractSessionDAO {

	private static final Logger logger = LoggerFactory.getLogger(MemcacheSessionDao.class);

	@Resource
	private MemcachedClient memcachedClient;

	private int timeout = 3600;

	/**
	 * 返回 memcachedClient
	 * 
	 * @return memcachedClient
	 */
	public MemcachedClient getMemcachedClient() {
		return memcachedClient;
	}

	/**
	 * 设置 memcachedClient
	 * 
	 * @param memcachedClient
	 */
	public void setMemcachedClient(MemcachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}

	/**
	 * 返回 timeout
	 * 
	 * @return timeout
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * 设置 timeout
	 * 
	 * @param timeout
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
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
	public void update(Session session) throws UnknownSessionException {
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
	public void delete(Session session) {
		if (session == null) {
			throw new NullPointerException("session argument cannot be null.");
		}

		Serializable sessionId = session.getId();
		if (sessionId != null) {
			memcachedClient.delete(sessionId.toString());
		}
	}

	@Override
	public Collection<Session> getActiveSessions() {
		return null;
	}

}