package com.learn.day05

fun main(args:Array<String>) {
    var list = arrayListOf("林青霞","范冰冰","苦于并")
    list.add("高圆圆")

    list.apply{
        this.add("张三")   //返回值就是调用者本身，常用于大范围的控制处理
    }

    /**----let
    1.任意对象都有let扩展函数
    2.let函数参数也是函数
    3. 函数参数他的参数是调用者本身
    4.返回值是lambda表达式的返回值
    ----*/
    list.let{
        "hahha"
    }.length


    /**-----with-
     * with返回值式第二个函数参数的返回值
    */

    /**
     * 任意类型都有扩展函数
     */
    list.run{

        this.add("zahn")
    }
}

