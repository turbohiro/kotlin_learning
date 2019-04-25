package com.learn.day01

//kotlin的if语句是有返回值，但Java没有；swich类似
fun main(args:Array<String>){
    val a=10
    val b=20
    //if 语句
    val max=if (a>b) a else b
    println(max)
}