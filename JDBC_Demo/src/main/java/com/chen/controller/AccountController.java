package com.chen.controller;

import com.chen.service.AccountService;
import com.chen.service.impl.AccountServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @项目名：  day09 
 *  @包名：    com.itheima.controller
 *  @文件名:   AccountController
 *  @创建者:   xiaomi
 *  @创建时间:  2018/6/11 10:44
 *  @描述：    TODO
 */
@RestController
public class AccountController {
    private static final String TAG = "AccountController";


    @RequestMapping("doTransfer")
    public String doTransfer(){


       /*
        //这是最早期只有两层的时候，controller直接和dao对接了。现在不能这么写了
       try {
            AccountDao dao = new AccountDaoImpl();
            dao.outMoney();
            dao.inMoney();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        try {
            AccountService service = new AccountServiceImpl();
            service.transfer();

            //跳转到的成功的页面。
            return "成功";
        } catch (Exception e) {
            e.printStackTrace();

            //跳转到失败的页面
            return e.getMessage();
        }


    }
}
