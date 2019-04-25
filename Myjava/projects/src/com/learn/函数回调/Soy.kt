package com.learn.函数回调

import java.text.SimpleDateFormat
import java.util.*

class Soy(var name:String){

}
fun main(args:Array<String>) {
    //得到20到25岁的数据
    val year = Calendar.getInstance().get(Calendar.YEAR)
    //println(year)
    val min = year - 25
    val max = year - 20
    val list = listOf("12006","12004","12001","11995")
    println(list.find{
        var bornyear = it.substring(1..4).toInt()
        bornyear<=max&&bornyear>=min


    })

    var formater = SimpleDateFormat("yyyy-MM-dd")
    val mintime = formater.parse("2016-02-13").time  //转化成秒钟时间
    println(mintime)
}