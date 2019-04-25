package Coroutine_basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//挂起函数必须通过suspend进行修饰
//挂起函数必须在协程中执行 或者其他挂起函数中执行
fun main(args:Array<String>){
    runBlocking {
        launch {
            mytask()

        }
    }
}
suspend fun mytask(){    //挂起函数
    println("协程执行前")

    //等待  非阻塞
    delay(2000L)  //delay是最基本的挂起函数
    //挂起函数 表示当前线程可以去执行其他任务，待达到挂起事件后，会从空闲线程池中选取空闲线程
    //来继续完成任务

    println("协程执行后")
}