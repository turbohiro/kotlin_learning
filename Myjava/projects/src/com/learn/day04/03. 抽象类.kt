package com.learn.day04

fun main(args:Array<String>){
    var chinese = ZhHuman()
    println(chinese.color)
}
//动物类--物种类--猫科动物类--犬科动物类（抽象类）---猫、狗（具体类），抽象类反应的是本质
//抽象类，在类中定义属性和行为，但不知道具体的值；抽象类可以继承抽象类，抽象类只能单继承
abstract class Human{  //人类
    //静态属性
    abstract var color:String
    abstract var language: String
    //动态行为
    abstract fun eat()
}

//继承抽象类，不需要在class前面open
open class ZhHuman: Human(){  //中国人
    override var color = "green"
    override var language = "Chinese"
    override fun eat(){
        println("用筷子吃饭")
    }
}