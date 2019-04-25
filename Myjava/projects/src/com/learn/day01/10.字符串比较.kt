package com.learn.day01

fun main(args:Array<String>){
    val a = "abc"
    val b = String(charArrayOf('a','b','c'))
    /*--比较的都是值--*/
    println(a.equals(b))
    println(a==b)
    /*-比较的是地址值--*/
    println(a===b)

}