package com.chen.dao;

import com.chen.beans.Student;

import java.util.List;

/**
 * 接口的好处：一种编程的思想：多态思想
 * 接口的定义：用于声明功能，定义标准、规范；实现类必须在接口规范下实现逻辑---声明和实现成功分开了
 * 面向接口编程：如果没有接口，就一个纯粹的具体类；如调用具体类时，需要查看复杂的代码，接口明显更清晰简单
 *
 */
public interface StudentDao {

    //保存
    void save(Student student);

    //删除
    void delete(int id);

    //更新
    void update(Student student);

    //逐个查询
    Student findById(int id);

    //查询全部
    List<Student> findAll();
}
