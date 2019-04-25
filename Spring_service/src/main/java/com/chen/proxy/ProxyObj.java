package com.chen.proxy;

public class ProxyObj implements Work{
    Work obj=null;
    public ProxyObj(){
        obj = new TargetObj();
    }

    @Override
    public void sing() {
        System.out.println("先跳一个舞");//使用代理对象，可以不改变源码；原始对象只实现唱歌功能
        obj.sing();
    }
}
