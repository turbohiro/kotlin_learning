//Ideal 每一个project相当于每一个工作空间，module相当于project
plugins{
    application
    kotlin("jvm")
}

//1.关闭gradle默认处理方案  遇到版本冲突时 不选择最高版本
//2. 强制执行版本号
/**
configurations.all{
    resolutionStrategy{
        failOnVersionConflict()
        force("commons-logging:1.1.1")
    }
}
*/
//指定主类名
application{
    mainClassName = "mainKt"
}
//代码仓库，jar包从代码仓库中下载
repositories{
    mavenCentral()
}

//jar包依赖
dependencies{
    compile(kotlin("stdlib"))
    compile("junit","junit","4.12")
    compile("commons-httpclient","commons-httpclient","3.1")//自动下载依赖的jar包（框架）
    compile("org.springframework","spring-core","2.5.6")
}