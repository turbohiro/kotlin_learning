package com.learn.day02

fun main(args:Array<String>){
    var a="abcs"
    /*---for 循环---*/  //主要用于遍历
    for(i in a){
        println(i)
    }
    for((index,value) in a.withIndex()){   //(index,value)
        println("index=$index value=$value")
    }

    /*--for each---*/
    a.forEach{
        println(it)
    }

    a.forEachIndexed { index, c ->
        println("index = $index, value = $c")  //带索引
    }
}