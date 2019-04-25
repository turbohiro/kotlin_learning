
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
    compile("mysql","mysql-connector-java","5.1.17")
    compile("com.mchange", "c3p0", "0.9.5.2")
    compile("commons-dbutils", "commons-dbutils", "1.6")
}