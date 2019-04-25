package com.learn.day01

fun main(args:Array<String>){
    sayhello("wenkai")
    println(getLength("wenkai"))
    println(getHello())
}

//有参无返回值
fun sayhello(name:String){
    println("hello"+name)
}

//有参有返回值
fun getLength(name:String) : Int{
    return name.length
}

//无参有返回值
fun getHello(): String {
    return "hello"
}