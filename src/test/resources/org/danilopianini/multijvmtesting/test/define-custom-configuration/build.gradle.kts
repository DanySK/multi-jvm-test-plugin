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
    val previousLts = if (latestLts == latestJava) latestLts - 4 else latestLts
    jvmVersionForCompilation.set(previousLts)
    maximumSupportedJvmVersion.set(latestJava)
    testByDefaultWith(previousLts, latestLts, latestJava)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
