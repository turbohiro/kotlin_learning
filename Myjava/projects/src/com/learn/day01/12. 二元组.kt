package com.learn.day01

fun main(args:Array<String>){
    /*--二元元祖--*/
    val pair = Pair<String,Int>("张三",20)
    val pair2 = "张三" to 20
    println(pair2.second)

    /*--三元元组--*/
    val triple = Triple("张三","20",20)

}
