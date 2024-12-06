plugins {
    java
    id("org.danilopianini.multi-jvm-test-plugin")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

multiJvm {
    jvmVersionForCompilation.set(latestJavaSupportedByGradle)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
