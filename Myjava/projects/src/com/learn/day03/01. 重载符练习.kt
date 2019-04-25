package com.learn.day03

fun main(args:Array<String>){
    var assister = Teacher()
    val teacher = assister++
    println("讲师级别为${teacher.level}，工资为${teacher.salary}")

}

/*
找到++对应的方法  inc
 */
class Teacher{
    //教师等级
    var level = 1
    //教师工资
    var salary = 6000

     operator fun inc(): Teacher{   //重载符的运用
         this.level++
         this.salary+=1000
         return this
     }
}