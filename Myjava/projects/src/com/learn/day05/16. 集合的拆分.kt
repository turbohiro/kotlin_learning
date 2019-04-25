package com.learn.day05

fun main(args:Array<String>){
    val list = listOf("张三","李迪","张森","李四")
    val pair = list.partition {
        it.startsWith("张")
    }   //返回二元组
    println(pair.first)
}