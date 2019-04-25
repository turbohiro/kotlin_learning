package Coroutine_basics

import kotlinx.coroutines.*
/*

fun main() {
    GlobalScope.launch { // launch new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}
*/
fun main(args:Array<String>){
    println("主线程开始启动")


 /*   GlobalScope.launch {
       //delay(3000L)
        println("协程开始启动")
    }*/
    runBlocking {
        launch{     //此时相当于线程dejoin???
            println("协程开始启动")
        }
    }

    println("主线程结束")
    //Thread.sleep(1000L)

}


