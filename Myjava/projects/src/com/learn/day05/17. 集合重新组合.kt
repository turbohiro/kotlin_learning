package com.learn.day05
fun main(args:Array<String>) {

    data class Person(var name: String, var age: Int)
    val list3 = listOf(Person("li", 4), Person("1w", 6))

    val list = list3.map{    //重新组合
        it.name.substring(0,1)  //取出第一个字符串的集Σ
    }
    println(list)

    val list5 = list3.sumBy {
        it.age
    }


}