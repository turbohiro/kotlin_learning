
plugins{
    application;
}

repositories{
    mavenCentral()
}

dependencies{
    compile("junit","junit","4.12")
    compile("org.springframework.boot:spring-boot-starter-web:1.5.13.RELEASE")
    compile("org.springframework:spring-context:4.3.17.RELEASE")
    compile("org.aspect","aspectjweaver","1.8.10")
}