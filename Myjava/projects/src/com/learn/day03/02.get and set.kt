package com.learn.day03



//kotlin字段会自动生成get 和 set方法，不同在Java自己定义
fun main(args:Array<String>){
    var person = Person()
    println(person.age)

}

class Person{
    var name = "张三"
    private set //name只能访问，不能修改
    var age = 20
}