package com.itheima.service.impl;

import com.itheima.service.UserService;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:15
 *  @描述：    该类演示的是使用set方法完成依赖注入
 */
public class UserServiceImpl02 implements UserService {

    private String address;


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl222的save方法~！"+address);
    }
}
