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
    jvmVersionForCompilation.set(9)
    maximumSupportedJvmVersion.set(13)
    excludeSupportFor(10)
    println(latestJava)
    println(supportedJvmVersions)
    println(allLtsVersions)
    testByDefaultWith(supportedLtsVersionsAndLatest)
}
