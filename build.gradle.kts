plugins {
    // 루트에서는 Spring Boot 플러그인을 apply하지 않는다
    // 각 모듈에서 직접 적용한다.
    id("io.spring.dependency-management") version "1.1.4"
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

allprojects {
    group = "com.eventflow"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {

    apply(plugin = "java")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }
}