package com.learn.day05

fun main(args:Array<String>){

    val add1 = {a:Int,b:Int-> a+b } //保存lambda表达式

    print(add1(10,20))

    val result = haha(10){a->a+10}
    println(result)
    //lambad表达式如果只有一个参数可以用it来代替
    val resulte = haha(10){it+10}
}

fun haha(a:Int,block:(Int)->Int):Int{
    return block(a)
}
