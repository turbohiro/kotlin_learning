package com.chen;

import com.chen.beans.Student;
import com.chen.dao.StudentDao;
import com.chen.dao.impl.StudentDaoImpl;
import com.chen.jdbc.util.JdbcUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static com.chen.jdbc.util.JdbcUtil.close;


public class test {
    @Test
    public void testSave(){

    Student student = new Student();
    student.setId(8);
    student.setName("ke");
    student.setChinese(88);
    student.setEnglish(90);
    student.setHistory(90);

    StudentDao studentDao = new StudentDaoImpl();
    studentDao.save(student);

    }

    @Test
    public void testdelete(){
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.delete(8);

    }

    @Test
    public void testupdate(){
        Student stu2 = new Student();
        stu2.setId(4);
        stu2.setName("ke");

        StudentDao studentDao = new StudentDaoImpl();
        studentDao.update(stu2);

    }


    @Test
    public void testfindById(){

        StudentDao studentDao = new StudentDaoImpl();
        Student stu = studentDao.findById(4);
        String name = stu.getName();
        int id = stu.getId();
        int english = stu.getEnglish();
        int chinese = stu.getChinese();
        int history = stu.getHistory();
        System.out.println("id:"+id+"name:"+name+"english:"+english+"chinese:"+chinese);

    }

    @Test
    public void testAll(){

        StudentDao studentDao = new StudentDaoImpl();
        List<Student> list = studentDao.findAll();
        for(Student stu : list){
            String name = stu.getName();
            int id = stu.getId();
            int english = stu.getEnglish();
            int chinese = stu.getChinese();
            int history = stu.getHistory();
            System.out.println("id:"+id+"name:"+name+"english:"+english+"chinese:"+chinese);

        }
    }

    @Test
    public void testPoolDemo(){

        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        try {
            try {
                dataSource.setDriverClass("com.mysql.jdbc.Driver");
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            }
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/turbo?useUnicode=true&characterEncoding=utf8");
            dataSource.setUser("root");
            dataSource.setPassword("asd13247167823");

                Connection conn = dataSource.getConnection();
                String sql3 = "update student set name = ? where id=?";
                PreparedStatement ps = null;

                ps = conn.prepareStatement(sql3);
                ps.setString(1,"hai");
                ps.setInt(2,4);

                ps.executeUpdate();

                conn.close();
                ps.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    //事务的测试

    @Test
    public void testtransaction(){
        Connection conn = JdbcUtil.getcon();
        PreparedStatement ps=null;

        try {
            //开启事务，要和连接挂钩
            conn.setAutoCommit(false);
            ///2.转账
            String sql = "update account set money = money-? where id =?";
            ps =conn.prepareStatement(sql);
            ps.setInt(1,-100);
            ps.setInt(2,1);
            ps.executeUpdate();

            ps.setInt(1,100);
            ps.setInt(2,2);
            ps.executeUpdate();

            System.out.println("转账成功");
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("转账失败");

        }finally {
            close(conn,ps);
        }


    }





}

