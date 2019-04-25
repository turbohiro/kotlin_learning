package Coroutine_basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args:Array<String>){
    println("主线程开始启动")


    GlobalScope.launch {
        //delay(3000L)
        (1..10).forEach {
            println("打印了${it}")
            delay(10L)   //delay 异步延迟，不会阻塞主进程
        }
    }

    println("主线程结束")
    Thread.sleep(1000L)

}
