package Coroutine_basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.xml.bind.JAXBElement

fun main(args:Array<String>){
    println("主线程开始启动")

    //开启并行的协程，launch前三个参数都是默认参数，最后一个参数是函数类型  调用的时候通过lambda表达式调用
    //launch参数的返回值是Job函数  代表协程的任务
   /**
    * 第一个参数： context  协程的上下文
    *  context: CoroutineContext = EmptyCoroutineContext
    *  context类型是 CoroutineContext  默认值是DefaultDispatcher,就是CommonPool
    *  默认的协程上下文,通过ForkJoinPool 实现
    *  ForkJoinPool  就是一个线程池
    *  协程其实也是在线程里执行，第一个参数决定协程在那个线程/线程池中执行
    */


    GlobalScope.launch {

    }

    println("主线程结束")
    //Thread.sleep(1000L)

}
