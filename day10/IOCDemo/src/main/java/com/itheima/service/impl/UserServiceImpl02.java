package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/*
 *  @项目名：  day10 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/12 9:15
 *  @描述：    使用注解来完成IOC
 *
 * 1.  @Component 是通用的注解，但是随着时间的推移，代码会分层来写，
 *      所以Spring针对三层的类也提供了各自的注解
 *
 *      web  --- @Controller
 *      serivce  --- @Service
 *      dao --- @Repository
 *
 *  2.  默认的都是单例 , 想要多例，就使用这个注解
 *      @Scope("prototype")
 *
 *  3. 如果托管了某一个类，但是没有写id标识符，那么默认是什么呢?
 *      类名，但是第一个字母小写
 *      UserServiceImpl02 ---> userServiceImpl02
 */

//@Component("us")  //组件  ,只要打上注解，就相当于告诉spring要创建这个类的实例了。



@Service("us")
@Scope("prototype")
public class UserServiceImpl02 implements UserService {

    //创建一个类的实例，其实就是会走这个类的构造方法

    public UserServiceImpl02(int a){

    }

    public UserServiceImpl02(){

    }

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法~！");
    }
}
