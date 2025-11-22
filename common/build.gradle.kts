plugins {
    id("io.spring.dependency-management")
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // Jackson
    implementation("com.fasterxml.jackson.core:jackson-databind")

    // Spring Core (Configuration / Bean 사용)
    implementation("org.springframework:spring-context")

    // Kafka
    implementation("org.springframework.kafka:spring-kafka")
}

tasks.test {
    useJUnitPlatform()
}