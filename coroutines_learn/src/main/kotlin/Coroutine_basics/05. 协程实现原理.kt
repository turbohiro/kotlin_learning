package Coroutine_basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 同步与异步区别：
 * 同步：任务是依次来执行的，一个线程（任务）结束才轮到下一个线程（任务）
 * 异步：不同的任务开启不同的线程（从线程池中选取）来完成任务
 *
 * 阻塞与非阻塞区别：
 * 阻塞：线程做任务时，需要等待（thread.sleep(1000l))完成任务
 * 非阻塞：执行某个任务时遇到阻塞的地方，就回到线程池，去执行其他任务
 *
 * 协程原理：
 * 1. 可以把耗时任务先挂起
 * 2. 等时间到了再从线程池中空闲的线程执行
 * 3. 必须是挂起函数（满足一定的条件）才能挂起
 *
 * 线程执行前后都是同一个线程，但协程执行前后可能不是同一个线程
 */
fun main(args:Array<String>){
   runBlocking {
       launch {
           println("协程执行前：${Thread.currentThread().name}")

           //等待  非阻塞
           delay(2000L)

           println("协程执行后：${Thread.currentThread().name}")

       }
       // 开启 之后还是同一个线程池 commonpool
       launch{
           Thread.sleep(3000L)
       }

       launch{
           Thread.sleep(3000L)
       }

       launch{
           Thread.sleep(1000L)
       }
   }
}

