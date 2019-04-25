package Coroutine_basics

import kotlinx.coroutines.*

fun main(args:Array<String>){


    val startTime = System.currentTimeMillis()
    runBlocking {
        val coroutinesList = List(100000){
            launch{
                println(".")
            }
        }
        coroutinesList.forEach {
            it.join()
        }

    }

    val endTime = System.currentTimeMillis()
    println("用时：${endTime-startTime}")
}
