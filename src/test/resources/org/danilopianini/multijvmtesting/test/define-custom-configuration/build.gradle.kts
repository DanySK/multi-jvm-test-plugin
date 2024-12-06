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
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
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
