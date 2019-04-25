package com.learn.day02

fun main(args:Array<String>){
    val array = arrayOf("张三","李四","王五")

    val index = array.indexOf("张三")
    val lastindex = array.lastIndexOf("张三")
    println(index)

    val index3 = array.indexOfFirst{
        it.startsWith("张")
    }
    println(index3)

    val index5 = array.indexOfLast{
        it.endsWith("四")
    }
    println(index5)
}