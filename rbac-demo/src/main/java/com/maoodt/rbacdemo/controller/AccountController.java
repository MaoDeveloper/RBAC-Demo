package com.maoodt.rbacdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户操作：登录、注册、改密、退出、注销
 * @author maodot
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

}
