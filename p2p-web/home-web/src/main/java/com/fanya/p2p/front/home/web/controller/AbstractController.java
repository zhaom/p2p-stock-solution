package com.fanya.p2p.front.home.web.controller;

import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.utils.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-20
 * Time: 下午5:29
 * To change this template use File | Settings | File Templates.
 */
public class AbstractController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected static Member getLoginMember() {
        return getLoginUser(false);
    }

    protected static Member getLoginUser(boolean returnRemembered) {
        Subject subject = SecurityUtils.getSubject();

        if (subject == null) {
            return null;
        }

        Session session = subject.getSession();
        if (session == null) {
            if (subject.isRemembered() == true) {
                return (Member) subject.getPrincipal();
            }
            return null;
        }
        return (Member) session.getAttribute(Constants.CURRENT_USER);
    }

    protected static String getCurrentUrl(HttpServletRequest request) {
        String url = request.getPathInfo();
        String queryString = request.getQueryString();

        if (queryString != null && queryString.length() > 0) {
            url += "?" + queryString;
        }
        return url;
    }

    protected static String getPageBaseUrl(HttpServletRequest request) {
        String queryString = request.getQueryString();

        queryString = queryString != null ? queryString.replaceAll("&?page=\\d*&?", "") + "page="
                : "page=";

        return request.getPathInfo() + "?" + queryString;
    }

}
