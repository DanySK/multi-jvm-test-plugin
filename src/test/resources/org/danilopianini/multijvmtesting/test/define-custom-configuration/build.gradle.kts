import org.apache.tools.ant.taskdefs.condition.Os

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
    if (Os.isFamily(Os.FAMILY_WINDOWS)) {
        excludeSupportFor(9, 10, 12, 13, 14, 15, 16)
    }
    println(latestJava)
    println(allLtsVersions)
    println(supportedJvmVersions.get())
    testByDefaultWith(8, *allLtsVersions.toIntArray(), latestJava)
}
