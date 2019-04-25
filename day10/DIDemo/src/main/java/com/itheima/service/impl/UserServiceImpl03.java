package com.itheima.service.impl;

import com.itheima.service.UserService;

import java.util.Map;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:15
 *  @描述：    该类演示的是使用set方法完成集合数据的注入
 */
public class UserServiceImpl03 implements UserService {

    /*private String [] address;


    public void setAddress(String [] address) {
        this.address = address;
    }*/

    /*
    private List<String> address;


    public void setAddress(List<String>  address) {
        this.address = address;
    }*/
    private Map<String , String> address;


    public void setAddress(Map<String , String>  address) {
        this.address = address;
    }

    @Override
    public void save() {
        System.out.println(" ===调用了UserServiceImpl222的save方法~！"+ address);
    }
}
