package com.fanya.p2p.front.user.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fanya.p2p.front.user.utils.Constants;
import com.fanya.p2p.front.user.web.bind.annotation.CurrentUser;
import com.solution.p2p.core.common.entity.SysUser;
import com.solution.p2p.core.common.service.AuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-14
 * <p>Version: 1.0
 */
@Controller
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Reference
    private AuthorizationService authorizationService;

    @RequestMapping("/")
    public String index(@CurrentUser SysUser loginUser, Model model) {
        //Set<String> permissions = authorizationService.findPermissions(Constants.SERVER_APP_KEY, loginUser.getUsername());
        //List<SysResource> menus = resourceService.findMenus(permissions);
        //logger.debug("menus count [{}]", menus.size());
        //model.addAttribute("menus", menus);
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


}
