package com.learn.day01


fun main(args:Array<String>){
    //String 非空类型
    //String？可空类型
    val str: String? = null
    //val int = str.toInt()
    //空安全运算符：?.
    str?.toInt()
}