package Coroutine_basics

import kotlinx.coroutines.*

fun main(args:Array<String>){
runBlocking {  //主协程

    /*----------aync-------------------*/
    val job1 = GlobalScope.async {
        job1()
    }

    val job2 = GlobalScope.async {
        job2()
    }

    val result1  = job1.await() //执行job1完之后才能执行，也是挂起函数，需要放到协程中
    val result2  = job2.await() //执行job2完之后才能
}

}

suspend fun job1():String{
    println("开始执行job1")
    delay(1000L)
    println("执行了job1")
    return "job1"

}

suspend fun job2():String{
    println("开始执行job2")
    delay(1000L)
    println("执行了job2")
    return "job2"

}