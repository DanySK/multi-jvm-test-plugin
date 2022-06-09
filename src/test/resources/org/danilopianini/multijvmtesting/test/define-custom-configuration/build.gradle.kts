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
    excludeSupportFor(9)
    excludeSupportFor(10)
    println(latestJava)
    println(allLtsVersions)
    println(supportedJvmVersions.get())
    testByDefaultWith(8, *allLtsVersions.toIntArray(), latestJava)
}
