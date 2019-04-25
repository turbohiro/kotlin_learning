package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.dao.impl
 *  @文件名:   UserDaoImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 11:04
 *  @描述：    TODO
 */
@Repository("ud") // Repository :仓库
public class UserDaoImpl implements UserDao{
    private static final String TAG = "UserDaoImpl";

    @Override
    public void save() {
        System.out.println("调用了UserDaoImpl的save方法~");
    }
}
