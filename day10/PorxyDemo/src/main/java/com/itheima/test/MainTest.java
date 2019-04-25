package com.itheima.test;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import com.itheima.util.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.test
 *  @文件名:   MainTest
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 12:02
 *  @描述：    TODO
 */
public class MainTest {
    private static final String TAG = "MainTest";

    public static void main(String [] args){
        /*UserService userService = new UserServiceImpl();
        userService.save();*/

/*
        //1 创建真实对象
        UserService userService = new UserServiceImpl();

        //2. 创建代理对象
        UserService  proxyObj  = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Logger.log();

                        return method.invoke( userService, args);
                    }
                }
        );*/


        /*UserService userService = new UserServiceImpl();
        userService.save();*/


        UserService proxyObj = getProxy();
        proxyObj.save();

    }


    public static UserService  getProxy(){
        //1 创建真实对象
        UserService userService = new UserServiceImpl();

        //2. 创建代理对象
        UserService  proxyObj  = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Logger.log();

                        return method.invoke( userService, args);
                    }
                }
        );

        return proxyObj;
    }
}
