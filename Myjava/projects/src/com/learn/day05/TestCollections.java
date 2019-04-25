package com.learn.day05;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestCollections {
    public static void main(String[] args){
        /*-------List----*/
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("高圆圆");
        list.add("高圆圆");
        for(String name:list){
            System.out.println(name);
        }

        /*----Vector-----*/
        HashSet<String> set = new HashSet<String>();
        set.add("林青霞");
        set.add("高圆圆");
        set.add("高圆圆");
        for(String name:set){
            System.out.println(name);  //输出不重复的数组
        }

        /*---map---*/
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("美女","林");
        map.put("数个","速度快");
        map.put("美女","sd1");

    }
}
