package com.learn.day02

fun main(args:Array<String>){
    val name = "HHEw2354dw_fdhj"
    println(parsr(name))
}

//判断用户名是否合法
fun parsr(name:String) : Boolean{
    //1.需要在3到20为之间
    //2.用户名必须是数字字母或_
    //3.必须有2个或以上的大写字母
    //2个以上小写字母
    //3个以上数字
    var upChar = 'A'..'Z'
    var loChar = 'a'..'z'
    var intange = '0'..'9'
    var upcount:Int=0
    var locount:Int=0
    var intcount:Int=0
    var linecount = 0
    //检查用户名长度
    if(name.length<3||name.length>20) return false

    name.forEach{
        when(it){
            in upChar->{
                //大写字母
                upcount++

            }
            in loChar->{
                locount++

            }
            in intange-> {
                intcount++
            }
            '_'->{
                linecount++

            }
            else->{
                return false
            }

        }
    }
    if (upcount<=2||locount<=3||intcount<=3)
        return false

    return true
}

