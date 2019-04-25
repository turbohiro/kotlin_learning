//负责当前模块的配置

plugins{
    application
    kotlin("jvm")
}


repositories {
    mavenCentral()
}


dependencies {
    compile(kotlin("stdlib"))
    compile("junit","junit","4.12")
}