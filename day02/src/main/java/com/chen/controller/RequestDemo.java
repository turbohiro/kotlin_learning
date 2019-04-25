package com.chen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class RequestDemo {
    //request对象就是对应了httpwatch抓取到的左边的数据内容
    @RequestMapping("Request")
    public String Request(HttpServletRequest request){
        System.out.println("request===="+request);
        //1.获取参数
        String username = request.getParameter("username");

        System.out.println("username===="+username);
        return "Request!!";
    }

    @RequestMapping("Reponse")
    public void Reponse(HttpServletResponse response){
        //1.写数据给浏览器
        System.out.println("request===="+response);
        try {
            response.getWriter().write("Response!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //return "Response!!";  //这一行数据是response带出去的
    }

}
