package com.itheima.test;

import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.test
 *  @文件名:   MainTest
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 14:46
 *  @描述：    TODO
 */
public class MainTest {
    private static final String TAG = "MainTest";

    public static void main(String [] args){


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceImpl us = (UserServiceImpl) context.getBean("us");

        //如果有配置了aop, 那么这里返回的就不是我们托管的那个UserServiceImpl的实例了。
        //而是它的代理实例
        System.out.println("us=" + us);


        us.save();

    }
}
