group = "com.learn.gradle"
version ="1.0-SNAPSHOT"

plugins {
    application              //包含很多常见的任务
    kotlin("jvm")  //使用kotlin——jvm插件
}
//制定主类名
application{
    mainClassName = "mainKt"
}
//配置文件中所有的代码会通过task任务的方式插入到project中
repositories {
     mavenCentral()
}

dependencies{
    compile(kotlin("stdlib"))
}

//project实例可以在配置文件中通过project隐式调用 projecct.groupID...

//task任务  每一个操作都可以定义为一个任务 前面学的plugins中已经打包了很多任务 可以直接调用
project.task("编译java文件"){
    println("开始编译java文件")
}


/**
 * task之间的依赖
 */
task("opendoor"){
    doFirst{
        println("打开冰箱门")
    }
}

task("putElephant"){
    doFirst{
        println("放入大象")
    }
}.dependsOn("opendoor")
//放入大象依赖于opendoor

task("closedoor"){
    doFirst{
        println("关闭冰箱门")
    }
}.dependsOn("putElephant")
//关闭冰箱门依赖于放入大象


//直接形成单独的task任务集
tasks{

    "open"{
        group = "操作"

    }
    "put"{
        group = "操作"
    }
    "close"{
        group = "操作"
    }
}