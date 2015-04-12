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
 * Time: 下午10:39
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/notice")
public class NoticeController extends AbstractController {

    @RequestMapping({"list",""})
    public String noticeList(HttpServletRequest httpServletRequest, Model model){
        return "notice/list";
    }

    @RequestMapping("/view/{id}")
    public String noticeList(HttpServletRequest httpServletRequest, @PathVariable("id") String noticeId){
        return "notice/viewDetail";
    }
}
