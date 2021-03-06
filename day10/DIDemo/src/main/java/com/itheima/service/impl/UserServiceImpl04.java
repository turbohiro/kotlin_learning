package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:15
 *  @描述：    该类演示的是对象类型的依赖注入， 也就是注入UserDao
 */
public class UserServiceImpl04 implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

   /*
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }*/

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法~！");


        //UserDao userDao = new UserDaoImpl();
        //userDao.save();


        userDao.save();
    }

}
