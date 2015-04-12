package com.fanya.p2p.front.home.web.controller;

import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-12
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController extends AbstractController {


    @RequestMapping({"/",""})
    public String index(HttpServletRequest httpServletRequest, Model model) {
        logger.debug("request home page, user [{}]",httpServletRequest.getAttribute(Constants.CURRENT_USER));
        Member member = getLoginMember();

        return "index";
    }

    @RequestMapping("login")
    @ResponseBody
    public String ajaxLogin(HttpServletRequest httpServletRequet){
        return "";
    }
}
