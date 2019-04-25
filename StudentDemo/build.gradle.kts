

plugins{
    application;
    kotlin("jvm")
}

repositories{
    mavenCentral()
}

dependencies{
    compile("junit","junit","4.12")
    compile("org.springframework.boot:spring-boot-starter-web:1.5.13.RELEASE")
}


