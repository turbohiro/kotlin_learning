package com.chen;

import com.chen.service.Impl.UserServiceImpl;
import com.chen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String [] args) {
        /*UserService userService = new UserServiceImpl();
        userService.save();*/

        //1.创建工厂,解析applicationContext.xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.问工厂要实例，要传过去在xml标识的id|name值
        UserService userService = (UserService) context.getBean("us");

        //3.调用方法
        userService.save();
    }
}
