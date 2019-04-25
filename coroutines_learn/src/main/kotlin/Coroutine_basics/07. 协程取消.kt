package Coroutine_basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args:Array<String>){
    runBlocking {
        val job = launch {
            (1..10).forEach {
                println("$it")
                delay(10)
            }
        }

        delay(5000L)
        job.cancel()//只能取消挂起的  不能取消阻塞的(不是delay而是thread.sleep)

        job.join()

    }

}