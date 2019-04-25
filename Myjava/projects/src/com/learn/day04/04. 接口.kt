package com.learn.day04

//抽象反映的是事物的本质，接口反映的是事物的能力
fun main(args:Array<String>){
    var xiaoming = XiaoMing()
    xiaoming.Ride()
}

class XiaoMing : ZhHuman(),RideBike,DriveCar{
    override fun car() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var license: String = "12"
    var licese: String = "12"  //对接口字段属性进行处理
    override fun Ride() {
        println("小明学会了骑车")
    }



}

//能力用接口表示

//骑车的能力
interface RideBike{
    //骑自行车的行为
    fun Ride()
}

//开车的能力
interface DriveCar{
    //驾照好吗
    var license :String

    //骑自行车的行为
    fun car()
}

