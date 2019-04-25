package com.learn.day05

fun main(args:Array<String>){
    val list = listOf('a','z','b')
    val list2 = list.sorted()
    println(list2)                   //顺序
    println(list.sortedDescending())  //倒序

    data class Person(var name:String,var age:Int)
    val list3 = listOf(Person("li",4),Person("1w",6))

    println(list3.sortedByDescending {    //对对象进行排序
        it.age
    })
}