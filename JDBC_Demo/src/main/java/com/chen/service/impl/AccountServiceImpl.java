package com.chen.service.impl;

import com.chen.dao.AccountDao;
import com.chen.dao.impl.AccountDaoImpl;
import com.chen.service.AccountService;
import com.chen.jdbc.util.JdbcUtil02;

import java.sql.Connection;
import java.sql.SQLException;

/*
 *  @项目名：  day09 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   AccountServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/11 10:56
 *  @描述：    这是转账的业务逻辑， 里面要涉及到事务的操作了。
 */
public class AccountServiceImpl implements AccountService {
    private static final String TAG = "AccountServiceImpl";



    //throws Exception  声明这个方法会抛出异常。
    @Override
    public void transfer() throws Exception {

        Connection conn = null;
        try {
            //开启事务 ---和连接对象挂钩
            conn = JdbcUtil02.getConn();
            conn.setAutoCommit(false);

            //这里可以抛异常，但是也必须抓异常。
            AccountDao dao = new AccountDaoImpl();

            dao.outMoney(conn);

            int a = 1/0;

            dao.inMoney(conn);


            //提交事务
            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
            //如果有异常，在异常catch里面，回滚事务。
            try {
                conn.rollback();

                //我选择手动抛出异常
                throw new Exception("转账失败");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }

    }
}
