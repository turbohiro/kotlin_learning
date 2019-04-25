package com.chen.bean;

import javax.persistence.*;

@Entity(name="Student1")
public class Student1 {
    private int id;
    private String name;

    private  User user; //创建关系要建立对象类型--->如果以前写的是int cid,那么Student表里面的外键cid 存放的是id值 int数字
    //如果写在改成对象类型，那么那么Student表里面的外键cid 存放的仍然是id值 int数字

    /**
     * 如果查询商品id为2的数据
     * 如果是以前的cid :那么查询出来的数据是这样： 2 iphone 2999 1  1---->表示手机的分类
     * 如果是现在的对象类型： 那么查询出来的数据因该是 2 iphone 2999 1  ，除了能拿到商品的数据外，还能拿到分类的数据
     * @return
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne  //直接和另一个表形成关联
    //@JoinColumn(name="cid")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
