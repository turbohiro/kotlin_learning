package com.learn.day05

data class Girl(var age:Int, var name:String, var height:Float, var place:String)
val list = listOf(Girl(12,"x",1.23f,"xs"),Girl(123,"s",1.43f,"xs"))

fun main(args:Array<String>){
    //java方式
 //   val list1 = ArrayList<Girl>()
    //遍历  判断  添加
  //  list.forEach{
  //      if(it.place == "xs")
  //          list1.add(it)
  //  }
   // println(list1)


    val list2 = list.filter{    //从list中选取合适的数据，查询并取出
        it.place =="xs"
    }
    println(list2)
}