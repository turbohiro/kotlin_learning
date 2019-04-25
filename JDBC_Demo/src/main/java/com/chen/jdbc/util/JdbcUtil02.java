package com.chen.jdbc.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *  @项目名：  day08 
 *  @包名：    com.itheima.jdbc.util
 *  @文件名:   JdbcUtil
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/9 9:47
 *  @描述：    这是jdbc的工具类，包含了获取连接 以及 释放连接的操作
 *              使用了properties来记录连接信息
 */
public class JdbcUtil02 {


    static ComboPooledDataSource dataSource = null;
    static {
        dataSource = new ComboPooledDataSource();
    }


    /**
     * 获取连接对象
     * @return
     */
    public static Connection getConn(){
        try {

          return   dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void close(Connection conn , Statement statement){
        close(conn , statement , null);
    }

                             /**
                              * 关闭连接，释放资源
                              */
    public static void close(Connection conn , Statement statement  , ResultSet rs){

        try {


            if(rs != null){
                rs .close();
            }

            if(statement != null){
                statement .close();
            }

            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
