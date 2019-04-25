package com.chen.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chen.beans.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController<json> {

    //Ajax发起请求
    @RequestMapping("ajaxGet")
    public String ajaxGet() {
        System.out.println("ajax!!!");

        return "success";  //服务器向页面发送数据
    }

    //Ajax发起请求
    @RequestMapping("ajaxPost")
    public String ajaxPost(String name, String password) {
        System.out.println("ajaxPost!!!:"+"name=="+name+"password==="+password);

        return "success_post";
    }

    //Ajax用于用户名校验
    @RequestMapping("checkUserName")
    public String checkUserName(String username) {
        System.out.println("ajaxPost!!!:"+"name=="+username);
        if("admin".equals(username)){
            return "use";
        }

        return "notuse";
    }

    //jquery GET
    @RequestMapping("jqueryGet")
    public String jqueryGet(String name, String password) {
        System.out.println("jqueryGet!!!:"+"name=="+name+"password==="+password);

        return "success";
    }

    //jquery GET
    @RequestMapping("jqueryPost")
    public String jqueryPost(String name, String password) {
        System.out.println("jqueryGet!!!:"+"name=="+name+"password==="+password);

        return "success";
    }

    //服务器端
    //网页端自动接收为json数据格式
    @RequestMapping("testJson")
    public Student testJson(){
        Student stu = new Student(2,"zhangsan2",28);
        return stu;
    }

    //返回JSON数组格式
    @RequestMapping("testJson2")
    public List<Student> testJson2(){

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(2,"zhangsan2",28));
        list.add(new Student(3,"zhangsan3",38));
        list.add(new Student(4,"zhangsan4",48));
        list.add(new Student(5,"zhangsan5",58));

        return list;
    }



    //json到数据
}