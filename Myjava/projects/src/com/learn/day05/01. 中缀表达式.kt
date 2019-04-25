package com.learn.day05


//infix
//必须只有一个参数；参数不能是可变参数或默认参数；必须是成员函数和构造函数
fun main(args:Array<String>) {
    var zhang = Person()
    zhang.greet("Li")
    zhang greet "Chen"



    val pair = Pair("占山",20)
    val pair2 = "zang" to 12
}
    //自定义操作符
class Person{

    infix fun greet(name:String){
        println("$name,您好")
    }
}