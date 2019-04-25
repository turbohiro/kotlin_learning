package com.learn.day05

fun main(args:Array<String>){
    val news = News("标题","描述","路径","内容")
    news.title
}

//相当于java的数据bean类
data class News(var title:String,var desc:String,var imagePath:String,var content:String)

    //标题     title
    //简介     desc
    //图片地址 imagePath
    //内容     content
    //构造方法
