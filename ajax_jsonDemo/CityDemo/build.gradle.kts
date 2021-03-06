
plugins{
    application;
}

repositories{
    mavenCentral()
}

dependencies{
    compile("junit","junit","4.12")
    compile("org.springframework.boot:spring-boot-starter-web:1.5.13.RELEASE")
    compile("org.thymeleaf:thymeleaf-spring4:2.1.4.RELEASE")
    compile("dom4j",  "dom4j", "1.6.1")
    compile("com.google.code.gson", "gson", "2.8.0")

}