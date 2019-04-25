package com.learn.day02

fun main(args:Array<String>){
    sendRequest("www.baidu.com")   //具名参数

}

fun sendRequest(path:String,method:String="GET"){   //GET POST 默认参数
    println("请求路径={$path},方法={$method}")

}

fun postRequest(path:String,method:String="POST"){
    println("请求路径={$path},方法={$method}")

}