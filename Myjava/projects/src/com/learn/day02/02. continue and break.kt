package com.learn.day02

//' ' 字符，" "字符串, break \continue 只能用在for，而不能是forEach
fun main(args:Array<String>){
    val str="abcs"
    for(i in str){
        if(i=='c'){
            continue
        }
        println(i)
    }
}