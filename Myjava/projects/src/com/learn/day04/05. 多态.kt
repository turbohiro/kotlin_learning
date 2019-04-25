package com.learn.day04
//把不同的子类对象都当作父类来看，父类有的方法，子类也有
fun main(args:Array<String>){
    var dog: Animal = Dog()
    var cat = Cat()
    cat.barkee()
    dog.barkee()
}

abstract class Animal{
    var color: String = " "
    open fun barkee(){
        println{"动物汪汪汪叫"}
    }
}

class Cat : Animal(){
    override fun barkee() {
        println("喵喵叫")
    }
}

class Dog : Animal(){
    override fun barkee() {
        println("汪汪叫")
    }

}