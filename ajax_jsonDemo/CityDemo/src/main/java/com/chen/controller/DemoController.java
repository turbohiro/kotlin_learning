package com.chen.controller;

import com.chen.beans.city;
import com.chen.beans.province;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DemoController{

    private static List<province> provinceList = new ArrayList<province>();
    private static Map<Integer,List<city>> map = new HashMap<>();

    static{
        provinceList.add(new province(1,"湖北"));
        provinceList.add(new province(2,"广东"));
        provinceList.add(new province(3,"湖南"));

        List<city> list01 = new ArrayList<city>();
        list01.add(new city(1,"武汉"));
        list01.add(new city(2,"黄石"));
        list01.add(new city(3,"黄冈"));

        List<city> list02 = new ArrayList<city>();
        list02.add(new city(1,"广州"));
        list02.add(new city(2,"深圳"));
        list02.add(new city(3,"惠州"));

        List<city> list03 = new ArrayList<city>();
        list03.add(new city(1,"长沙"));
        list03.add(new city(2,"岳阳"));
        list03.add(new city(3,"益阳"));

        map.put(1,list01);
        map.put(2,list02);
        map.put(3,list03);
    }

    @RequestMapping("listProvince")
    public List<province> listProvince(){
        return provinceList;
    }

    @RequestMapping("listCity")
    public List<city> listCity(int id){
        return map.get(id) ;
    }



}