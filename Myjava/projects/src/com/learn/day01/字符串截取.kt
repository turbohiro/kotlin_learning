package com.learn.day01

fun main(args:Array<String>){
    val str = "ANSYS Chemkin Pro 17.0 Release 15151 Win\\workplace\\IC16_simplified"
    println(str.substring(0..5))
    println(str.substringBefore("P"))
    println(str.substringAfter("P"))
}