package Coroutine_basics

import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main(args:Array<String>)= runBlocking{
    //第一个参数代表协程上下文  指定协程代码在哪个线程池中执行  默认是通过commonpool实行

    val job1 = launch {
    println("协程执行")
}
    val job2 = launch(coroutineContext) {
        println("协程执行")
    }

    val job3 = launch(newFixedThreadPoolContext(5,"新线程")){
        println("新协程执行")
    }

    job1.join()
    job3.join()



}