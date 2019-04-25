package com.learn.day02
import java.io.*


fun main(args:Array<String>){

    var a=10
    var b=0
    try{
        a/b
    }catch(e:ArithmeticException){
        println("捕获到数值异常")
    }finally{
        "print最终执行的代码"
    }

    /*--kotlin编译时异常--*/

    val file = File("a,txt")
    //val brf = BufferReader(FileReader(file))



}