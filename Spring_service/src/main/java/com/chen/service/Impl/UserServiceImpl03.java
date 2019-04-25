package com.chen.service.Impl;

import com.chen.dao.UserDao;
import com.chen.service.UserService;

/**
 * 该类演示的是对象类型的依赖注入， 也就是注入UserDao
 */
public class UserServiceImpl03 implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法~！");


        //UserDa userDao = new UserDaoImpl();
        //userDao.save();


        userDao.save();
    }

}
