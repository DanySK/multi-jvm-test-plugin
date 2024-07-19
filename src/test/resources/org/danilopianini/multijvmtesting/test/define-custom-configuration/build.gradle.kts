import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.withType

plugins {
    id("org.danilopianini.multi-jvm-test-plugin")
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
    jvmVersionForCompilation.set(8)
    maximumSupportedJvmVersion.set(latestJava)
    testByDefaultWith(8, *allLtsVersions.toIntArray(), latestJava)
}

tasks.withType<Test>().configureEach {
    enabled = when (this.javaLauncher.get().metadata.languageVersion.asInt()) {
        multiJvm.jvmVersionForCompilation.get() -> true
        multiJvm.maximumSupportedJvmVersion.get() -> true
        else -> false
    }
}
