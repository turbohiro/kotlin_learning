package com.chen.dao.impl;

import com.chen.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("ud") // Repository :仓库
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("调用了UserDaoImpl的save方法~");
    }
}
