package com.chen;

import com.chen.bean.User;

import javax.persistence.*;

public class MainApp {
    public static void main(String [] args){
        //要执行增删改查，必须要有管理员

        //1.获取实体工厂
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aa");

        //2.创建实体管理员
        EntityManager entityManager =factory.createEntityManager();

        //3.开启事务, 写入数据必须开启事务
        EntityTransaction transaction =entityManager.getTransaction();
        transaction.begin();

        //3.保存数据
        User user =new User();
        user.setAge(19);
        user.setName("奥巴马");

        entityManager.persist(user);  //（1）保存

        User user2 = entityManager.find(User.class,1);//（2) 查询

        entityManager.remove(user2);  //(3) 删除：先查人，再删除

        user2.setName("老大");
        entityManager.persist(user2); //(4) 更新：先查人，并修改属性；再保存

        //（5)查询所有
        Query query = entityManager.createQuery("select t from User t");//这儿是类的名字；不是数据库表的名字
        System.out.println(query.getResultList());

        transaction.commit();
    }
}
