package com.fanya.p2p.front.user.web.shiro.filter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.solution.p2p.core.common.service.MemberService;
import com.solution.p2p.core.common.utils.Constants;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-3-16
 * <p>Version: 1.0
 */
public class ServerFormAuthenticationFilter extends FormAuthenticationFilter {

    @Reference
    private MemberService memberService;

    private final Logger logger = LoggerFactory.getLogger(ServerFormAuthenticationFilter.class);

    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        String fallbackUrl = (String) getSubject(request, response)
                .getSession().getAttribute("authc.fallbackUrl");
        if(StringUtils.isEmpty(fallbackUrl)) {
            fallbackUrl = getSuccessUrl();
        }
        WebUtils.redirectToSavedRequest(request, response, fallbackUrl);
    }

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String jsonResult = httpServletRequest.getParameter("jsonResult");
        logger.info("login jsonresult [{}]",jsonResult);
        if(org.springframework.util.StringUtils.hasText(jsonResult)){
            httpServletResponse.setCharacterEncoding("UTF-8");

            subject.getSession().setAttribute(Constants.CURRENT_USER, memberService.findByUsername((String)token.getPrincipal(), com.fanya.p2p.front.user.utils.Constants.APP_KEY,  "changqianmingyuguang").getValue());
            PrintWriter out = httpServletResponse.getWriter();
            out.println("{\"status\":1,\"message\":\"登入成功\"}");
            out.flush();
            out.close();
            logger.info("login ajax");
            return false;
        }
        this.issueSuccessRedirect(request, response);
        return false;
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String jsonResult = httpServletRequest.getParameter("jsonResult");
        if(org.springframework.util.StringUtils.hasText(jsonResult)){
            try {
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                String message = e.getClass().getSimpleName();
                if ("IncorrectCredentialsException".equals(message)) {
                    out.println("{\"status\":0,\"message\":\"密码错误\"}");
                } else if ("UnknownAccountException".equals(message)) {
                    out.println("{\"status\":0,\"message\":\"账号不存在\"}");
                } else if ("LockedAccountException".equals(message)) {
                    out.println("{\"status\":0,\"message\":\"账号被锁定\"}");
                } else {
                    out.println("{\"status\":0,\"message\":\"未知错误\"}");
                }
                out.flush();
                out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            return false;
        }
        this.setFailureAttribute(request, e);
        return true;
    }
}
