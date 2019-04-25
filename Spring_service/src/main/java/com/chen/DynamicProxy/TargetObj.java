package com.chen.DynamicProxy;

public class TargetObj implements Work{
    @Override
    public void sing() {
        System.out.println("学友来唱歌。。。");
    }
}
