package com.learn.day02

fun main(args:Array<String>){
    print(add3(1,2,3))

}

/*
只要是Int类型，无论传递多少个参数都能求解
 */
fun add3(vararg a:Int):Int{    //可变参数
    //a是什么类型
    var result = 0
    a.forEach{
        result+=it
    }
    return result
}