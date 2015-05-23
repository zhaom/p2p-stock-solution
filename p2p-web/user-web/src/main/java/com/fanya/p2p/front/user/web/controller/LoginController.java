package com.fanya.p2p.front.user.web.controller;

import com.fanya.p2p.front.user.utils.Constants;
import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.service.MemberService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Controller
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    private MemberService memberService;

    @RequestMapping(value = "/login")
    public String showLoginForm(HttpServletRequest req, Model model) {
        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);
        return "login";
    }

    @RequestMapping(value = "/register")
    public String showRegisterForm(HttpServletRequest request, Model model){
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(Member member, String smsCode, RedirectAttributes redirectAttributes){
        logger.debug("do register");
        //TODO：处理手机验证码
        memberService.createUser(member, Constants.APP_KEY, "changqianmingyuguang");
        redirectAttributes.addFlashAttribute("msg", "注册成功，请登录");
        return "login";
    }

    @RequestMapping(value = "/register/validate", method = RequestMethod.POST)
    public @ResponseBody
    Map<String,Boolean> doRegisterValidate(String content){
        logger.debug("validate content :[{}]", content);
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        Member member = memberService.findByUsername(content, Constants.APP_KEY, "changqianmingyuguang").getValue();
        if(member != null){
            result.put("valid", false);
        }else {
            result.put("valid", true);
        }
        return result;
    }

    @RequestMapping(value = "/password-reset")
    public String showFindPasswdForm(HttpServletRequest request, Model model){
        return "findPasswd";
    }

    @RequestMapping(value = "/password-reset",method = RequestMethod.POST)
    public String doPasswordReset(HttpServletRequest request,String mobile, String smsCode, String oldPassword, String newPassword, RedirectAttributes redirectAttributes){
        logger.debug("do password reset for mobile:[{}]", mobile);
        Member member = (Member)request.getSession().getAttribute(Constants.CURRENT_USER);
        memberService.resetPassword(member.getId(), oldPassword, newPassword, Constants.APP_KEY, "changqianmingyuguang");
        return "redirect:/logout";
    }

}
