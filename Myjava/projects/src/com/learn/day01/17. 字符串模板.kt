package com.learn.day01

//${ } 字符串模板--变量/函数
fun main(args:Array<String>){

//生成日记模板
    println(createFiary("天安门"))
}

fun createFiary(place:String):String{
    val result = "今天晴朗无云，我们去${place}玩，${place}很好看,${place.length},${bark()}"
    return result
}

fun bark() :String{
    return "bark"
}