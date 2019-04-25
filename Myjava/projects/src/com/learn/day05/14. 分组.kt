package com.learn.day05

fun main(args:Array<String>){
    //不同姓氏分组
    val list = listOf("张三","李迪","张森","李四")
    println(list.groupBy {
        //it.startsWith("张")
        val first = it.substring(0,1)
        when(first){
            "张"->"张"
            else->"李"
        }
    })
}