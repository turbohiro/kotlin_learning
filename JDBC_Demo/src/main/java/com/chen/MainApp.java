package com.chen;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//1.入口类注解//他会扫描当前入口类包中所有子包中带注解的类，才能认识controller
public class MainApp {
    private static final String TAG="MainApp";
    public static void main(String[] args){
        //背后是启动了tomcat，并把项目发布到了tomcat上
        SpringApplication.run(MainApp.class,args);  //2.让项目跑起来
    }

}
