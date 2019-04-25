package com.learn.day02

fun main(args:Array<String>){
    /*--定义1--100--*/
    val range1 = 1..100
    val range2 = IntRange(1,100)
    val range3 = 1.rangeTo(100)
    /*--长整形区间-*/
    val range4 = 1L..100L
    val range5 = LongRange(1,100)
    /*--字符区间--*/
    val range6 = 'a'..'z'
    val range7 = CharRange('a','z')
}