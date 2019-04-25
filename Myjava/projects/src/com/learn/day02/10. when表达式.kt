package com.learn.day02

fun main(args:Array<String>){
    //7 岁 开始上小学
    //12岁 开始上中学
    //15岁 开始上高中
    //18岁 开始上大学
    val age = 15
    //小功能
    println(todo(age))
}

fun todo(age:Int): String{
    when(age){
        7->{
            return ("开始上小学")
        }
        12->{
            return ("开始上初中")

        }
        15->{
            return ("开始上高中")

        }
        18->{
            return ("开始上大学")
        }
        else ->{
            return("进入社会")
        }
    }
}