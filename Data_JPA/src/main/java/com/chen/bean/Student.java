package com.chen.bean;

import javax.persistence.*;

@Entity(name = "Student")
public class Student {
    private int id;
    private int cid;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //建立多对一关系，与User表
    @ManyToOne(targetEntity = User.class) //增加外键，与User之间建立关系，id主键相连
    //@JoinColumn(name = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
