package com.chen.controller;

import com.chen.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("register")
    public String register(User user){
        System.out.println("调用了register方法：" +user);
        return "register success!";
    }
}
