package com.learn.day06

fun main(args:Array<String>) {
    var html = Tag("html")
    println(html)

}
//任何标签都是Tag的子类
class Tag(var name:String){
    //还应该有容器保存其他的标签head/body...
    val list = ArrayList<Tag>()
    fun setTag(tag:Tag){
        list.add(tag)
    }
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("<$name>")
        list.forEach{
            sb.append(it.toString())
        }

        sb.append("</$name>")

        return sb.toString()
    }
}