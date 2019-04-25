package com.learn.day02

fun main(args:Array<String>){
    val str ="abcs"
    val str2 = "1234"

    //将abcs和1234结合起来
    for(i in str){
        tag1@for(j in str2){
            println("$i,$j")

            if(i=='b'&&j=='2')
                break@tag1
        }
    }
}