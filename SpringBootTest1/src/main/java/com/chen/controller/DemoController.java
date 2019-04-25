package com.chen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//1.表示这个类为控制类
@RestController
public class DemoController{
    //2.表示浏览器什么地址，才能对应上这个方法

    //请求映射，将方法映射到服务器上
    @RequestMapping("save")
    public void save(){
        System.out.println("调用了save方法");
    }

    @RequestMapping("update")
    public String update(){
        System.out.println("调用了update方法");

        return "成功执行了update";
    }
}
