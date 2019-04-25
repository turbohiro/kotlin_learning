package com.chen.dao.impl;

import com.chen.dao.AccountDao;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/*
 *  @项目名：  day09 
 *  @包名：    com.itheima.dao.impl
 *  @文件名:   AccountDaoImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/11 10:46
 *  @描述：    TODO
 */
public class AccountDaoImpl implements AccountDao {
    private static final String TAG = "AccountDaoImpl";

    @Override
    public void outMoney(Connection connection) throws SQLException {

        QueryRunner runner = new QueryRunner();
        String sql = "update account set money=money-? where id = ?";
        runner.update(connection , sql ,100 , 1);

    }

    @Override
    public void inMoney(Connection connection) throws SQLException {

        QueryRunner runner = new QueryRunner();
        String sql = "update account set money=money+? where id = ?";
        runner.update(connection, sql ,100 , 2);

    }
}
