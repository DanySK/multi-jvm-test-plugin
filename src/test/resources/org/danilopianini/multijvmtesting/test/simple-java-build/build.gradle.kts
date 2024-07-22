import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.api.tasks.testing.Test

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

if (System.getenv("GITHUB_ACTIONS") == "true" && Os.isFamily(Os.FAMILY_WINDOWS)) {
    // There is limited space available on GitHub Actions Windows instances:
    // only test the most recent version of Java there.
    multiJvm {
        logger.warn(
            "Detected a GitHub Actions Windows runner. Window runners have very limited disk space," +
                    "and thus all tests will run solely with Java {}.",
            latestJavaSupportedByGradle,
        )
        testByDefaultWith(latestJavaSupportedByGradle)
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
