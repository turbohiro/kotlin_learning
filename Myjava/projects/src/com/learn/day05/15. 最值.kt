package com.learn.day05

fun main(args:Array<String>){
    val list = listOf('a','z','b')
    println(list.max())
    data class Person(var name:String,var age:Int)
    val list3 = listOf(Person("li",4),Person("1w",6))
    println(list3.minBy {
        it.age
    })
    println(list.distinct())//找出不重复的数据
    println(list.toSet())
}