package com.learn.day02

//函数和对象都是一等公民
fun main(args:Array<String>){
    var a=20
    var b=10

    //函数变量
    val padd=::add   //：：获得add函数的引用
   //通过padd调用函数
    println(padd(a,b))
    println(padd?.invoke(a,b)) //可以处理函数变量为空的情况下的调用

    //匿名函数
    val padd2 :(Int,Int)->Int = {a,b->a+b}
    print(padd2(2,3))


}
fun add(a:Int,b:Int) = a+b