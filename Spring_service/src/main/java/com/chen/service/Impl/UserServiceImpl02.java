package com.chen.service.Impl;

import com.chen.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * 该类演示的是使用set方法完成集合数据的注入
 */
public class UserServiceImpl02 implements UserService {

    /**private Map<String,String> address;

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }
     **/
    private List<String> address;

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public void save(){
        System.out.println("调用UserServiceImpl02成功！！！"+address);
    }
}
