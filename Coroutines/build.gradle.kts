
plugins{
    application
    kotlin("jvm") version "1.3.0"
}

repositories{
    mavenCentral()
    jcenter()  //协程仓库
}

dependencies {
    compile(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")
}