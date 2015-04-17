package com.fanya.p2p.front.user.web.shiro.filter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fanya.p2p.front.user.utils.Constants;
import com.solution.p2p.core.common.service.MemberService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-15
 * <p>Version: 1.0
 */
public class SysUserFilter extends PathMatchingFilter {

    @Reference
    private MemberService memberService;

    public void setUserService(MemberService memberService) {
        this.memberService = memberService;
    }

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

        String username = (String)SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER, memberService.findByUsername(username, Constants.APP_KEY, "changqianmingyuguang").getValue());
        return true;
    }
}
