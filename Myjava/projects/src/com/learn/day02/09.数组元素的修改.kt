package com.learn.day02

fun main(args:Array<String>){
    val array = arrayOf(1,2,3,4,5)

    array[2] = 6    //修改数组元素
    array.set(3,9)

    array.forEach{
        println(it)
    }
}