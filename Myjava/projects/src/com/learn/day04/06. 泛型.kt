package com.learn.day04

fun main(args:Array<String>){
    var box = Box<String>("张三")
    println(box.thing)
    parasetype("占山")
}


//类泛型
class Box<T> (var thing: T) { //物品类型不确定，定义泛型和使用泛型
    //用箱子
}


//函数泛型
fun <T> parasetype(thing:T){
    when(thing){
        is Int-> println("这是Int")
        is String->println("这是String")
        else ->println("不知道具体类型")
    }
}



