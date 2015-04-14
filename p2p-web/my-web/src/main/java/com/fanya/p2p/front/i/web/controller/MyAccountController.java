package com.fanya.p2p.front.i.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 我的账户.
 * User: JohnKee
 * Date: 15-4-13
 * Time: 下午11:01
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("myaccount")
public class MyAccountController extends AbstractController {
    /**
     * 充值
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping("toRecharge")
    public String toRecharge(HttpServletRequest httpServletRequest, Model model){
        return "account/toRecharge";
    }

    /**
     * 提现
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping("toWithdraw")
    public String toWithdraw(HttpServletRequest httpServletRequest, Model model){
        return "account/toWithdraw";
    }

    /**
     * 提现列表
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping("withdraws")
    public String withdrawList(HttpServletRequest httpServletRequest, Model model){
        return "account/withdrawList";
    }

    /**
     * 资金流水
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping("money/summary")
    public String moneyFlow(HttpServletRequest httpServletRequest, Model model){
        return "money/summary";
    }

    /**
     * 红包
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping("red/usables")
    public String redEnv(HttpServletRequest httpServletRequest, Model model){
        return "red/usables";
    }

    /**
     * 推广
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping("promotion")
    public String invitePromotion(HttpServletRequest httpServletRequest, Model model){
        return "promotion";
    }

}
