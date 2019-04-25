package com.chen.jdbc;

import com.chen.jdbc.util.JdbcUtil;

import java.sql.*;

public class jdbc2 {
    public static void main(String [] args){

        //1.启动连接
        Connection conn = JdbcUtil.getcon();

        //2.执行数据库操作
        Statement statement = null;
        ResultSet rs =null;
        try {
            statement = conn.createStatement();
            //1.添加
            String sql1 = "insert into student values (4,'wen',90,89,90)";  //values来自网页端传送过来的数据
            //2.删除
            String sql2 = "delete from student where id=1";  //以后id都是来自网页端用户的输入
            //3.更新
            String sql3 = "update student set name = ? where id=?";  //？代表占位符

            PreparedStatement ps = conn.prepareStatement(sql3);//采用preparement可以防止sql注入攻击
            //参数一是占位符的索引，参数二是具体值
            ps.setString(1,"hai");
            ps.setInt(2,4);
            int result = ps.executeUpdate();
            //int result = statement.executeUpdate(sql3);
            System.out.println("result = "+result);
            //--========================================>>>>>>>>>>>>>++++++
            //4.查询所有记录
            String sql = "select * from student";

            //5.查询一条记录
            String sql6 = "select * from student where id=?";
            PreparedStatement ps1 = conn.prepareStatement(sql6);
            ps1.setInt(1,3);
            rs = ps1.executeQuery();
            //6.聚合查询：总数，最大值，最小值
            String sql7 = "select count(*) from student ";
            //rs = statement.executeQuery(sql6);
            //rs:结果集  rs.next()试图移到下一条记录,如果能移动就是true
            while(rs.next()){
                String name = rs.getString("name");
                //参数可以选两种--列的索引或列的名字
                int id = rs.getInt("id");
                int english = rs.getInt("english");
                System.out.println("name="+name+"id="+id+"english="+english);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   //关闭连接
            JdbcUtil.close(conn,statement,rs);
        }
    }
}
