package com.learn.day06

fun main(args:Array<String>) {
    var address = Address("chen","sd",2)
    var person = Person("li",32)

}

class Person(var name:String, var Age:Int)
class Address(var city:String, var street:String, var number:Int)