package com.fanya.p2p.front.i.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-13
 * Time: 下午10:11
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/myinvest")
public class MyInvestController extends AbstractController {

    @RequestMapping({"possess",""})
    public String myInvest(HttpServletRequest httpServletRequest, Model model){
        return "invest/possess";
    }

    @RequestMapping("inbiding")
    public String myInvesting(HttpServletRequest httpServletRequest, Model model){
        return "invest/inbiding";
    }

    @RequestMapping("refunded")
    public String myRefunded(HttpServletRequest httpServletRequest, Model model){
        return "invest/refunded";
    }

    @RequestMapping({"transferable/list", "transferable"})
    public String listTransferable(HttpServletRequest httpServletRequest, Model model){
        return "transfer/transferableList";
    }

    @RequestMapping("transfer/list")
    public String listTransfer(HttpServletRequest httpServletRequest, Model model){
        return "transfer/transferList";
    }

    @RequestMapping("transfer/outs")
    public String listTransferOutList(HttpServletRequest httpServletRequest, Model model){
        return "transfer/outList";
    }

    @RequestMapping("transfer/ins")
    public String listTransferInList(HttpServletRequest httpServletRequest, Model model){
        return "transfer/inList";
    }


    @RequestMapping("autoInvest")
    public String autoInvest(HttpServletRequest httpServletRequest, Model model){
        return "autoinvest/auinvest";
    }
}
