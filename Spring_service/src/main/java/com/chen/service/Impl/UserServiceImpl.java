package com.chen.service.Impl;

import com.chen.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Component 是通用的注解，但是随着时间的推移，代码会分层来写，所以Spring针对三层的类也提供了各自的注解
 * Controller--@Controller
 * Service--@Service
 * dao--@Repository
 * 2.默认是单例，想要多例，就使用这个注解
 * @Scope("prototype")
 * 3.如果托管了某一个类，但是没有写id标识符，那么默认是多少呢？
 * 类名，但是第一个字母小写：UserServiceImpl--->userServiceImpl
 */
//@Component("us")
//@Service("us")
public class UserServiceImpl implements UserService {
    private  String address;
    public UserServiceImpl(String address){this.address = address;}

    @Override
    public void save(){
        System.out.println("调用UserServiceImpl成功！！！"+address);
    }
}
