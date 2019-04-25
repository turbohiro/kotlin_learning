package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:15
 *  @描述：    该类演示的是对象类型的依赖注入,使用注解的方式
 */
@Service("us")
public class UserServiceImpl05 implements UserService {
/*
    private UserDao userDao; // = new UserDaoImpl()

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/


    //@Resource(name="ud")  根据给定的标识符去找到对应的实例对象，然后赋值给userDao

    @Autowired  //自动注入 根据最终要求的类型，然后找到对应的实现类对象，注入进来。
    private UserDao userDao;


    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法~！");


        userDao.save();
    }

}
