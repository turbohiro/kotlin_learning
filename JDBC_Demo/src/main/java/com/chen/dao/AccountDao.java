package com.chen.dao;

import java.sql.Connection;
import java.sql.SQLException;

/*
 *  @项目名：  day09 
 *  @包名：    com.itheima.dao
 *  @文件名:   AccountDao
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/11 10:45
 *  @描述：    TODO
 */
public interface AccountDao {

    void outMoney(Connection connection) throws SQLException;

    void inMoney(Connection connection) throws SQLException;
}
