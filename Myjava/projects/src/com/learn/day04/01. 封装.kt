package com.learn.day04

fun main(args:Array<String>){
    val machine = Washmachine("Haier",12)
    machine.opendoor()
    println("放入牛仔裤")
    machine.closedoor()
    machine.Selectmode(1)
    machine.start()
    //setMotorspeed(1000)   这个函数不能被用户使用，因此用private函数
}

/*
    程序员A：定义洗衣机的类型
 */
class Washmachine(var brand:String, var l:Int){
    //保存用户输入的模式
    var mode =0 //默认模式      全局变量
    //01 开门
    fun opendoor(){
        println("打开洗衣机门。。。")

    }
    //02 关门
    fun closedoor(){
        println("关闭洗衣机门。。。")
    }
    fun start(){
        when(mode){
            0-> {
                println("请选择模式")
            }
            1->{
                println("开始放水。。。")
                println("水放满了。。。")
                println("模式为轻柔模式")
                setMotorspeed(1000)
                println("衣服洗好了。。。")
            }
            2->{
                println("开始放水。。。")
                println("水放满了。。。")
                println("模式为狂柔模式")
                setMotorspeed(5000)
                println("衣服洗好了。。。")

            }
            else->{
                println("模式设置错误")
            }
        }

    }
    //用户设置模式
    fun Selectmode(mode:Int){
        this.mode = mode
    }

    private fun setMotorspeed(speed:Int){
        println("当前洗衣转速为${speed}")
    }

}