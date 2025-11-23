plugins {
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

    dependencyManagement {
        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:3.2.3")
        }
    }

    dependencies {
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }
}