package com.learn.day02

fun main(args:Array<String>){
    val range1 = 1..10 //正向区间
    //反向区间
    val range2 = 10 downTo 1
    range2.forEach{
        println(it)
    }
    //区间的反转
    val range3 = range1.reversed()
    for (i in range3 step 2){  ///step设置步长
        println(i)
    }
}