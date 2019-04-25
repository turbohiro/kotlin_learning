package com.learn.day05

fun main(args:Array<String>){
    var father = smallHead()
    father.wash()
}

//洗碗能力
interface washpower{
    fun wash()

}

class BigHeadson : washpower{
    override fun wash(){
        println("大头儿子洗碗了")
    }
}

//小头爸爸把洗碗的能力继承了大头儿子
class smallHead : washpower by BigHeadson()  //类委托

//class smallHead(var washpower:washpower) : washpower by washpower
