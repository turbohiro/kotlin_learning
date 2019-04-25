package com.learn.day02

fun main(args:Array<String>){
    val arr1 = arrayOf("张三","李四","王五")

    val arry = IntArray(10)// new int[10],CharArray,BooleanArray...
    val arry3 = IntArray(10){
        30
    }
    for (i in arry3){
        println(i)
    }
}