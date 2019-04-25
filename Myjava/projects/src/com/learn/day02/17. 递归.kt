package com.learn.day02

fun main(args:Array<String>){

    //阶乘 n！
    println(fact(5))
}

/*
  求n的阶乘,stackoverflow  容易栈内存溢出
 */
fun fact(n:Int):Int{

    if(n==1){
        return 1
    }else{
        return n*fact(n-1)
    }
}