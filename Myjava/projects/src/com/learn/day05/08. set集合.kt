package com.learn.day05

fun main(args:Array<String>){
    val set1 = setOf("林青霞","aa","hha")
    println(set1)
    var set2 = mutableSetOf<String>("林青霞","aa","aa")
    println(set2)

    var map1 = mutableMapOf<String,String>("china" to "chinese","america" to "american")
    //hashMapOf("" to "")
    //遍历map集合
    val keyset = map1.keys
    keyset.forEach{
        print(it)
    }

    val valueset = map1.values
    valueset.forEach{
        print(it)
    }
    //map所有元素的遍历
    map1.forEach{ t,u ->
        println("key=$t,value = $u")
    }
}