import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.withType

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
    // Set maximumSupportedJvmVersion strictly below latestJava so that the LTS range
    // is bounded by maximumSupportedJvmVersion, not latestJava.
    // This is a regression test: without the fix, check would not wire testWithLtsJvms.
    val previousLts = if (latestLts == latestJava) latestLts - 4 else latestLts
    maximumSupportedJvmVersion.set(previousLts)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
    enabled = false
}
