package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.test
 *  @文件名:   MainTest
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:16
 *  @描述：    TODO
 */
public class MainTest {
    private static final String TAG = "MainTest";

    public static void main(String [] args){

       /* UserService userService = new UserServiceImpl();
        userService.save();*/


       //1. 创建工厂

        //创建工厂，并且会解析applicationContext.xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. 问工厂要实例 , 要传递过去在xml标识的id | name值
        UserService userService = (UserService) context.getBean("us");

        //3. 调用方法
        userService.save();

        //关闭工厂，一般不会关闭工厂。
        //context.close();
    }
}
