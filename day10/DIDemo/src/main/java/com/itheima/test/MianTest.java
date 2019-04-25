package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.test
 *  @文件名:   MianTest
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 10:42
 *  @描述：    TODO
 */
public class MianTest {
    private static final String TAG = "MianTest";

    public static void main(String [] args){


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService us = (UserService) context.getBean("us");

        us.save();
    }
}
