package com.itheima.service.impl;

import com.itheima.service.UserService;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:15
 *  @描述：    TODO
 */
public class UserServiceImpl implements UserService {

    //创建一个类的实例，其实就是会走这个类的构造方法

    public UserServiceImpl(int a){

    }

    public UserServiceImpl(){

    }

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法~！");
    }
}
