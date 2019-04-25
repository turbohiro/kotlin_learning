package com.learn.day05

fun main(args:Array<String>){
    val a =10
    val b = 20

    val c = a+b
    val d =sub(a,b)
    println(c)
    println(d)
    println(cal(a,b,::add))
    //匿名函数：{m,n-> m+n}---lambda表达式； cacl--高阶函数--函数参数也是函数
    println(cal(a,b,{m,n-> m+n}))
    println(cal(a,b){m,n-> m+n})
}

fun sub(a:Int,b:Int)  = a+b

//第三个参数是函数类型，说明kotilin里面的函数可以传递函数参数；如果函数里面传递函数参数的话 就成为高阶函数
fun cal(a:Int,b:Int,block:(Int,Int)->Int):Int{
    val result = block(a,b)
    return result
}

fun add(a: Int,b:Int):Int{
    return a+b
}
