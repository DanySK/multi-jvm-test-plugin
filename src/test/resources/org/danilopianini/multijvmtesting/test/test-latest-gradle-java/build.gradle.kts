plugins {
    java
    id("org.danilopianini.multi-jvm-test-plugin")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.8.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

multiJvm {
    jvmVersionForCompilation.set(latestJavaSupportedByGradle)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
