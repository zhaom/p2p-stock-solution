package com.fanya.p2p.front.home.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 2015/5/5.
 */
@Controller
@RequestMapping("/about")
public class AboutUsController extends AbstractController {

    @RequestMapping({"/list", ""})
    public String aboutHome(HttpServletRequest httpServletRequest, Model model) {
        return "abount/index";
    }
}
