package com.fanya.p2p.front.i.web.controller;

import com.fanya.p2p.front.i.web.service.AccountServiceLocal;
import com.solution.p2p.core.common.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-20
 * Time: 下午4:18
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/account")
public class IndexController extends AbstractController{


    private AccountServiceLocal accountServiceLocal;

    public void setAccountServiceLocal(AccountServiceLocal accountServiceLocal) {
        this.accountServiceLocal = accountServiceLocal;
    }

    @RequestMapping("/summary")
    public String summary(HttpServletRequest httpServletRequest, Model model) {
        logger.debug("request account summary, user [{}]",httpServletRequest.getAttribute("user"));
        SysUser sysUser = getLoginUser();

        return "index";
    }
}
