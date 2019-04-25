
plugins {
    application;
}



repositories {
    mavenCentral()
}

dependencies {
    compile("junit","junit", "4.12")
    //mysql数据库的依赖
    compile("mysql","mysql-connector-java","5.1.17")
    //hibernate 实体管理者，对接JPA规范的管理员
    compile("org.hibernate","hibernate-entitymanager","4.3.9.Final")
}
