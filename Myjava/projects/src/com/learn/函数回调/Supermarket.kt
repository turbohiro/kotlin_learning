package com.learn.函数回调

import java.lang.Thread.*

class Supermarket{
    fun buySoy():Soy{
        sleep(5000)
        //创建soy对象
        var soy = Soy("海天")
        //返回soy对象
        return soy
    }
}

