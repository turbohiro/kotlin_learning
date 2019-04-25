package com.learn.day05

fun main(args:Array<String>){
    /*----List----*/
    val list = listOf("林青霞","高圆圆","范冰冰")
    //不能添加元素，修改元素-----只读集合
    list.forEach{
        println(it)
    }

    var list2 = mutableListOf<String>("林青霞","高圆圆","范冰冰")
    list2.set(0,"李艳")                 //指定位置修改
    list2.add(2,"kj")  //指定位置添加
    list2.forEach{
        println(it)
    }

    var list3 = ArrayList<String>()

}

