package com.chen.jdbc.util;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {

    private static String url;
    private static String username;
    private static String password ;
    private static String driverClassName;

    static{   //文本配置文件放到专门的properties文件中
        try {
            Properties properties = new Properties();//与properties配置文件建立联系，并读取properties的value值
            InputStream is = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            try {
                properties.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
            driverClassName = properties.getProperty("driverClassName");//key--value
            username = properties.getProperty("username");
            url = properties.getProperty("url");
            password = properties.getProperty("password");
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //1.建立连接的方法
    public static Connection getcon() {

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    //2.关闭连接的方法

    public static void close(Connection conn, Statement statement){//重载，一个方法两个参数和三个参数都可以使用
        close(conn,statement,null);
    }
    public static void close(Connection conn, Statement statement, ResultSet res){
        try {
            if(statement!=null){
                statement.close();
            }
            if(statement!=null){
                conn.close();
                //connection = null;
            }
            if(res!=null){
                res.close();
                //connection = null;
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }


    //mysql语句
    //1.增加
    //insert into student values (1,'chen',20,30,80)
    //2.删除
    //delete from student where id=4
    //3.更新
    //update student set name='wen' where id=1
    //4.查询
    //select * from student

}
