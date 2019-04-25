package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class Testcontroller {

    @RequestMapping("testPage")
    public String testPage(){
        System.out.println("testpage!!");

        return "test.html";
    }
}
