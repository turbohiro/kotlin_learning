package com.learn.day02

fun main(args:Array<String>){
    var girl = Girl()
    println(girl.name)
    girl.Greeting()

    var rectangle = Rectangle()
    println(rectangle.square(20,10))

    var a=Girl()
    var b=Girl()

    var newgirl = a+b
    println(newgirl)
}

//矩形
class Rectangle{
    //静态属性
    var height:Int=100
    var width:Int = 20

    fun square(height:Int,width:Int) :Int{
        return height*width
    }
}
class Girl{

    operator fun plus(girl:Girl):Girl{  //重载运算符，对+重新定义，使对象能够运算
        return this
    }
    //静态属性
    var name: String ="lili"
    var age:Int = 23

    fun Greeting(){
        println("hello!")
    }

}