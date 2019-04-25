package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.test
 *  @文件名:   MainTest
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:58
 *  @描述：    TODO
 */
public class MainTest {
    private static final String TAG = "MainTest";

    public static void main(String [] args){

        //1. 创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");




        //问工厂要实例
        UserService userService = (UserService) context.getBean("us");

        userService.save();
    }
}
