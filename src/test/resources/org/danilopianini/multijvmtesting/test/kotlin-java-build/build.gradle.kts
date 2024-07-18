import org.apache.tools.ant.taskdefs.condition.Os

plugins {
    id("org.danilopianini.multi-jvm-test-plugin")
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

multiJvm {
    jvmVersionForCompilation.set(17)
    maximumSupportedJvmVersion.set(21)
}
