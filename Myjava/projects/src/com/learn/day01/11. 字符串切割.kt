package com.learn.day01

fun main(args:Array<String>){
    val str = "张三.李四-王五"

    var result = str.split(".","-")//list string
    println(result)
}