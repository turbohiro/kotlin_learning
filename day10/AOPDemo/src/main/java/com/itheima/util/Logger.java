package com.itheima.util;

import org.aspectj.lang.ProceedingJoinPoint;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.util
 *  @文件名:   Logger
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 14:47
 *  @描述：    TODO
 */
public class Logger {
    private static final String TAG = "Logger";

    public void log(){
        System.out.println("输出日志~~");
    }

    //joinPoint 参数其实就是我们的目标对象
    public void around(ProceedingJoinPoint joinPoint){

        try {
            log();
            joinPoint.proceed(); //调用了目标方法其实就相当于 xxx.save();
            log();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
