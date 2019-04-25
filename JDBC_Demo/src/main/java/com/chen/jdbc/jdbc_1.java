package com.chen.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_1 {
    public static void main(String [] args){

        Statement statement=null;
        Connection connection=null;
        //1.注册驱动，把连接mysql类的字节码加载到JVM
        try {
            DriverManager.registerDriver(new Driver());

            //2.要想连接数据库连接驱动
            String url="jdbc:mysql://localhost:3306/turbo?useUnicode=true&characterEncoding=utf8";
            String username= "root";
            String password = "asd13247167823";
            connection = DriverManager.getConnection(url,username,password);
            //System.out.print(connection);   //获得数据库连接

            //3.往其中一个表添加记录(更新数据）
            statement = connection.createStatement();
            String sql = "insert into student values (2, 'chen',89,90,91)";
            int result = statement.executeUpdate(sql);  //执行mysql语言

            System.out.println("result = "+result);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {            //最后需要释放掉statement和connection
            try {
                if(statement!=null){
                statement.close();
                //statement= null;
                }
                if(statement!=null){
                connection.close();
                //connection = null;
                }
            } catch(SQLException e) {
                e.printStackTrace();
            }


        }

    }
}
