package com.learn.day05

fun main(args:Array<String>){
    val stark = Nedstark.Robstark()
    val h1 = hasRight(stark)
    print(h1)
}

/*
判断有没有继承权
先把有继承权的放在一起  其他都是无继承权的
 */
fun hasRight(stark:Nedstark):Boolean{
    return when(stark){
        is  Nedstark.Robstark->true
        is Nedstark.Sansastark->true
        else -> false
    }
}
sealed class Nedstark{   //封装类非封装的是类型，枚举则是数据
    class Robstark:Nedstark() //子类
    class Sansastark:Nedstark()
}  //父类


class Johnsnowstark:Nedstark()