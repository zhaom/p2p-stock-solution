package com.fanya.p2p.front.home.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-12
 * Time: 下午10:28
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/edelivery")
public class EdeliveryController extends AbstractController {

    @RequestMapping({"/index","/",""})
    public String index(HttpServletRequest httpServletRequest,Model model) {
        return "download/index";
    }

    @RequestMapping("/download/{id}")
    public String doDownload(HttpServletRequest httpServletRequest, @PathVariable("id")String id){
        // record donwload
        return "redirect:";
    }
}
