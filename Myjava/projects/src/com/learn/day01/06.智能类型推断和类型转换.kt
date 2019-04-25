package com.learn.day01

fun main(args:Array<String>){
    /*--kotlin 智能类型推断--*/
    var a =10
    var c = "asd"

    a = 20
    c="sd"
    println(c)

    /*--kotlin 类型转换--*/
    //kotlin 可以通过to来转换数据类型
    var b="20"
    println(b.toInt())
    println(a.toByte())

    var n=10
    var m=10L
    //n = m.toInt()
    m = n.toLong()

}