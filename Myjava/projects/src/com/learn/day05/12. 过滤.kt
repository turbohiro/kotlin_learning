package com.learn.day05

fun main(args:Array<String>){
    val list = listOf("张三","李迪","张森","李四")
    val listn = listOf("张三","李迪","张森","李四")

    val list1 = list.find{
        it.startsWith("张")
    }
    println(list1)  //查找一个

    val list2 = list.filter{
        it.startsWith("张")
    }
    println(list2)

    val list3 = list.filterIndexed { index, s -> index%2==0 }  //按索引查询取数
    println(list3)
}