package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Democontroller {

    //从网页获取数据
    @RequestMapping("doGet")
    public String doGet(String name, String password){
        System.out.println("username:"+name+"password:"+password);

        return "doGet!!";
    }

    //向网页发送数据
    @RequestMapping("doPost")
    public String doPost(String name, String password){
        System.out.println("username:"+name+"password:"+password);

        return "doPost!!";
    }

    /**请求转发与重定向区别：
     * 1.请求转发：一次请求(在testPage内部自动转向了html)；重定向：两次请求
     * (先进入RedirectPage,在跳转进入真实（根源）的html页面）；
     * 2.数据的保存问题：请求转发：跳转在页面上可以拿到controller保存的数据；重定向则不能；
     * 3.请求转发是服务器内部跳转，只能跳转服务器内部的页面(不能跳转其他任何网页）；
     * 重定向是浏览器重新定位，可以跳转所有页面
     *
     * 注册登录界面：重定向
     * 查询界面：请求转发
     */
    //测试网页定向跳转：请求转发
    @RequestMapping("testPage")
    public String testPage(){
        System.out.println("testpage!!");

        //return "test_request.html";  //浏览器仍然在testPage页面
        return "https://web.mit.edu/";
    }

    //测试网页定向跳转：重定向1
    @RequestMapping("RedirectPage1")
    public String RedirectPage1(){
        System.out.println("RedirectPage1!!");

        //return "redirect:test_request.html";   //浏览器会跳转到html页面上
        return "redirect:https://web.mit.edu/";
    }

    //1.登陆到login页面，并在页面存username,password数据,传到controller
    //2. controller跳转到index页面上显示显示数据username
    //@RequestMapping("user_login")
    @RequestMapping("user_login")
    public String user_login(String username, String password, Model model){

        System.out.println("name:"+username+"password:"+password);

        //把网页传过来的username，password存起来
        model.addAttribute("nickname",username);
        return "index";

    }

     /**
    @RequestMapping("user_login")
    public ModelAndView user_login(){

        //System.out.println("name:"+username+"password:"+password);

        //1.指定数据
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("nickname","北京");
        //2.指定视图
        modelAndView.setViewName("index");

        return modelAndView;

    }
    */

     //获取cookie并进行数据比较
     @RequestMapping("login")
     public String login(HttpServletRequest request,HttpServletResponse response, String username, String password){

         //System.out.println("name:"+username+"password:"+password);
        //登陆成功
         if("admin".equals(username)&&"123".equals(password)){
             //假如现在是第二次来了，那么要获取cookie
             Cookie [] cookies = request.getCookies();
             //不能直接遍历！因为第一次是没有cookies
             if(cookies!=null){
                 for(Cookie cookie:cookies){
                     String name = cookie.getName();
                     String value = cookie.getValue();
                     //System.out.println(name+"=="+value);

                     //比较时间
                     if("last".equals(name)){
                         String cookievalue = cookie.getValue();

                     }
                 }
             }

             //1.获取时间戳
             Cookie cookie = new Cookie("last",System.currentTimeMillis()+"");
             cookie.setMaxAge(60*60*24*7);//7天

             //返回cookie
             response.addCookie(cookie);
             response.addCookie(new Cookie("aa","bb"));

             return "登陆成功";
         }

         return "登陆失败";

     }


    @RequestMapping("test")
    public String test(HttpServletRequest request){


        //1. 获取session  session 其实就是内存中的一块区域。
        HttpSession session = request.getSession();

        //2. 获取sessionid
        String id = session.getId();

        //3. 存值
        session.setAttribute("address","中国");

        //4. 获取值
        String address = (String) session.getAttribute("address");

        System.out.println("sessionId=" + id +" =111= address="+address);  //刷新浏览器，sessionId会发生变换
        //5. session是服务器的一块内存空间，
        //移除属性
        // session.removeAttribute("address");

        // address = (String) session.getAttribute("address");

        // System.out.println("sessionId=" + id +" =222= address="+address);

        //6. 销毁session
        session.invalidate();

        //System.out.println("id=" + session.getId());

        // address = (String) session.getAttribute("address");

        //System.out.println("address=" + address);

        session.setAttribute("aa","bb");

        System.out.println("aa="+session.getAttribute("aa"));

        return "test success";
    }



    //以下是实验部分， test2: 存值 ，test3:取值

    @RequestMapping("test2")
    public String test2(HttpServletRequest request){

        //存值
        HttpSession session = request.getSession();

        session.setAttribute("address","深圳");

        //打印id
        String id = session.getId();
        System.out.println("test2::: sessionId = " + id);

        return "test2 success";
    }


    @RequestMapping("test3")
    public String test3(HttpServletRequest request){

        //取值  只要产生了session空间，那么服务器会自动的把session的id 存放到cookie里面去。临时性的cookie
        HttpSession session = request.getSession();
        String address = (String) session.getAttribute("address");

        //打印ID
        String id = session.getId();
        System.out.println("test3::: sessionId = " + id);



        return "test3 success -- " +address;
    }

}


















