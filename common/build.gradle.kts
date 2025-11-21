plugins {
    id("io.spring.dependency-management")
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    // Lombok (공통 DTO에 사용)
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // Jackson (이벤트 직렬화/역직렬화)
    implementation("com.fasterxml.jackson.core:jackson-databind")

    // Kafka event 기반을 위해 필요 (하지만 Boot는 각 서비스에서 적용)
    implementation("org.springframework.kafka:spring-kafka")
}

tasks.test {
    useJUnitPlatform()
}