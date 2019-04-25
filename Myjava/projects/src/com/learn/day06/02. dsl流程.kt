package com.learn.day06.si


//dsl只是对问题解决方案模型的外部封装，这个模型可能是一个api库
//dsl代码的编辑
fun main(args:Array<String>) {
    val person = person{
        name = "chen"
        age = 30
        address{
            city = "shen"
            number = 12
        }
    }

}

//1.定义person高阶函数
/**
 * 第一步：实现person函数
 * 函数参数可能只有一个参数 先不写
 * 函数参数可能有返回值 先不写
 */
fun person(block:Person. ()->Unit):Person{  //第二步：实现name属性可以添加person的Person对象  接收者为Person对象的函数
    return Person().apply(block)
}

//2.定义address高阶函数
fun Person.address(block:Address.()->Unit){  //第二步：实现name属性可以添加person的Person对象  接收者为Person对象的函数

    this.address = Address().apply(block)
}

data class Person(var name:String?=null, var age:Int?=null,var address:Address?=null)
data class Address(var city:String?=null, var number:Int?=null)
