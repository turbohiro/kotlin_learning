package com.learn.day02

fun main(args:Array<String>){
    //7 岁 开始上小学
    //12岁 开始上中学
    //15岁 开始上高中
    //18岁 开始上大学
    val age = 16
    //小功能
    println(todo1(age))
}

fun todo1(age:Int): String{   //分支可以支持区间和多条件表达式
    when(age){
        is Int -> return "传递的是Int类型"  //条件表达式
        1,2,3,4,5,6,7->{
            return ("开始上小学")
        }
        in 8..12->{           //用区间表示
            return ("开始上初中")

        }
        13,14,15->{
            return ("开始上高中")

        }
        16,17,18->{
            return ("开始上大学")
        }
        else ->{
            return("进入社会")
        }
    }
}