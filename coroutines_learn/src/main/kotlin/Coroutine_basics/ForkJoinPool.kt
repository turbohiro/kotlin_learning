package Coroutine_basics

import kotlinx.coroutines.*

/**
 * ForkJoinPool启动的是守护线程，通过launch函数启动的线程是守护线程池;
 * 因此launch函数直接执行时先让主线程睡眠一下，来让守护线程可以执行完
 */
fun main(args:Array<String>){
    println("主线程开始启动")

    //并行启动线程：主线程睡眠
/*    val job = GlobalScope.launch{
        println("协程代码")
    }*/

    //串行启动线程：加上runblocking,不用主线程睡眠
    runBlocking {
        val job = launch {

            (1..10).forEach {
                println("打印了${it}")
                //delay(10L)   //delay 异步延迟，不会阻塞主进程
            }
        }
    }

    println("主线程结束代码")
    //Thread.sleep(1000L)

}

