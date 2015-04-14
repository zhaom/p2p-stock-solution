package com.fanya.p2p.front.i.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-13
 * Time: 下午10:10
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/mystock")
public class MyStockController extends AbstractController {

    @RequestMapping({"/stock",""})
    public String stockAccount(HttpServletRequest httpServletRequest, Model model){
        return "stock/listAccount";
    }

    @RequestMapping("orders")
    public String myStockOrder(HttpServletRequest httpServletRequest, Model model){
        return "order/orderList";
    }

    @RequestMapping("order/thru")
    public String thruStockOrder(HttpServletRequest httpServletRequest, Model model){
        return "order/thruList";
    }

    @RequestMapping("/stock/{id}/addmargin")
    public String addMargin(HttpServletRequest httpServletRequest, @PathVariable("id") String id,Model model){
        return "stock/addMargin";
    }

    @RequestMapping("/stock/{id}/withdrawprofit")
    public String withdrawProfit(HttpServletRequest httpServletRequest, @PathVariable("id") String id, Model model){
        return "stock/withdrawProfit";
    }

    @RequestMapping("order/renewal/{id}")
    public String renewalOrder(HttpServletRequest httpServletRequest, @PathVariable("id") String id, Model model) {
        return "order/renewal";
    }

    @RequestMapping("/stock/{id}/addcapital")
    public String addCapital(HttpServletRequest httpServletRequest, @PathVariable("id") String id, Model model){
        return "stock/addCapital";
    }


}
