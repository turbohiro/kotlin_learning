package com.learn.函数回调

fun main(args:Array<String>){
    var supermarket = Supermarket()
    var soy = supermarket.buySoy()

    println("买到了${soy.name}牌酱油")
    println("妈妈开始做菜了")
}

