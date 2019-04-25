package com.learn.day05

fun main(args:Array<String>){
    println(WEEK.星期一)
    val result = WEEK.values()
    //result.forEach(println(it))
    println(Color.Red)

}

enum class WEEK{
    星期一,星期二,星期三
}

enum class Color(r:Int,g:Int,b:Int){
    Red(255,0,0),Green(0,255,0),Blue(0,0,255)
}
