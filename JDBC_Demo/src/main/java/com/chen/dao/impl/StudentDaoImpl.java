package com.chen.dao.impl;

import com.chen.beans.Student;
import com.chen.dao.StudentDao;
import com.chen.jdbc.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过接口实现类来直接操作数据库
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public void save(Student stu) {

        //1.启动连接
        Connection conn = JdbcUtil.getcon();
        PreparedStatement ps=null;
        try {
            String sql = "insert into student values (?,?,?,?,?)";
            ps= conn.prepareStatement(sql);
            ps.setInt(1,stu.getId());
            ps.setString(2,stu.getName());
            ps.setInt(3,stu.getEnglish());
            ps.setInt(4,stu.getChinese());
            ps.setInt(5,stu.getHistory());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   //关闭连接
            JdbcUtil.close(conn,ps);
        }
    }

    @Override
    public void delete(int id) {
        //1.启动连接
        Connection conn = JdbcUtil.getcon();
        PreparedStatement ps=null;
        try {
            String sql = "delete from student where id=?";
            ps= conn.prepareStatement(sql);
            ps.setInt(1,id);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   //关闭连接
            JdbcUtil.close(conn,ps);
        }
    }

    @Override
    public void update(Student stu) {
        //1.启动连接
        Connection conn = JdbcUtil.getcon();
        PreparedStatement ps=null;
        try {
            String sql = "update student set name = ? where id=?";
            ps= conn.prepareStatement(sql);
            ps.setString(1,stu.getName());
            ps.setInt(2,stu.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   //关闭连接
            JdbcUtil.close(conn,ps);
        }
    }

    @Override
    public Student findById(int id) {
        //1.启动连接
        Connection conn = JdbcUtil.getcon();
        PreparedStatement ps=null;
        ResultSet rs =null;
        Student stu=null;
        try {
            String sql = "select * from student where id=?";
            ps= conn.prepareStatement(sql);
            ps.setInt(1,id);

            rs = ps.executeQuery();
            stu = new Student();
            while(rs.next()){
                stu.setName(rs.getString("name"));
                //参数可以选两种--列的索引或列的名字
                stu.setId( rs.getInt("id"));
                stu.setEnglish(rs.getInt("english"));
                stu.setChinese(rs.getInt("chinese"));
                stu.setHistory(rs.getInt("history"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   //关闭连接
            JdbcUtil.close(conn,ps,rs);
        }
        return stu;

    }


    @Override
    public List<Student> findAll() {
        //1.启动连接
        Connection conn = JdbcUtil.getcon();
        PreparedStatement ps=null;
        ResultSet rs =null;
        List<Student> list = null;
        try {
            String sql = "select * from student ";
            ps= conn.prepareStatement(sql);

            rs = ps.executeQuery();
            list = new ArrayList<>();
            while(rs.next()){
                Student stu = new Student();
                stu.setName(rs.getString("name"));
                //参数可以选两种--列的索引或列的名字
                stu.setId( rs.getInt("id"));
                stu.setEnglish(rs.getInt("english"));
                stu.setChinese(rs.getInt("chinese"));
                stu.setHistory(rs.getInt("history"));

                list.add(stu);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {   //关闭连接
            JdbcUtil.close(conn,ps,rs);
        }
        return list;
    }








}
