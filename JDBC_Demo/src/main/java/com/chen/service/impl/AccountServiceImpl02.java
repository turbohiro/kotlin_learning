package com.chen.service.impl;

import com.chen.service.AccountService;

import java.sql.SQLException;

/*
 *  @项目名：  day09 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   AccountServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/11 10:56
 *  @描述：    TODO
 */
public class AccountServiceImpl02 implements AccountService {
    private static final String TAG = "AccountServiceImpl";


    @Override
    public void transfer() throws SQLException {
/*
        //这里可以抛异常，但是也必须抓异常。
        AccountDao dao = new AccountDaoImpl();

        dao.outMoney();

        int a = 1/0;

        dao.inMoney();*/

    }
}
