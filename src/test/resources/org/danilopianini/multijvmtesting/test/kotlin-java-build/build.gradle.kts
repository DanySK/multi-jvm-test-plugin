import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.api.tasks.testing.Test

plugins {
    id("org.danilopianini.multi-jvm-test-plugin")
    kotlin("jvm")
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
    jvmVersionForCompilation.set(8)
    maximumSupportedJvmVersion.set(21)
    testByDefaultWith(8, 21)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
