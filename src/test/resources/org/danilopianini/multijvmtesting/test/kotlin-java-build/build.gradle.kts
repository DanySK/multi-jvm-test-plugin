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
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

multiJvm {
    jvmVersionForCompilation.set(8)
    maximumSupportedJvmVersion.set(21)
    testByDefaultWith(8, 21)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
