package com.learn.day04


fun main(args:Array<String>){
    var son =Son()
    println(son.age)
    son.horbe()
}

//kotlin的原始class都是final,不能被继承
open class Father{
    open var name = "占山"
    open var age =  12
    //动态行为
    open fun horbe(){
        println("父亲喜欢抽烟")
    }

}

class Son: Father(){
    override var name: String = "张思"
    override var age: Int = 10

    override fun horbe(){
        println("孩子喜欢看书")
    }
}