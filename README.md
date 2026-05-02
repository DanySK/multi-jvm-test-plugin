# Multi-JVM Testing For Gradle

This plugin configures a Gradle build to compile with one JVM version and run tests with multiple JVM versions.
It works with Java projects, Kotlin/JVM projects, and Kotlin Multiplatform projects with JVM tests.

## What It Adds

For each `Test` task in your build, the plugin creates:

* `testWithJvmXX` tasks, one per known Java version
* `testWithLatestJvm`
* `testWithLtsJvms`
* `testWithLtsAndLatestJvms`

It also configures:

* the main `test` task to run with `jvmVersionForCompilation`
* Java, Kotlin/JVM, and Kotlin Multiplatform JVM toolchains to use `jvmVersionForCompilation`
* `check` to run the JVMs selected by `testByDefaultWith(...)`

## Requirements

Gradle 9 requires running the build itself on Java 17 or newer.
This plugin can still compile and test your project against older Java versions by using toolchains.

The plugin does not install JDKs by itself.
If you want Gradle to provision missing toolchains automatically, enable the Foojay resolver in `settings.gradle.kts`:

```kotlin
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "<latest version>"
}
```

## Basic Setup

```kotlin
plugins {
    java
    id("org.danilopianini.multi-jvm-test-plugin") version "<plugin version>"
}

multiJvm {
    jvmVersionForCompilation.set(17)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
```

## Default Behavior

By default:

* code is compiled for Java 8
* `maximumSupportedJvmVersion` is set to `latestJava`
* `check` runs tests on `supportedLtsVersionsAndLatest`

In practice, that means `check` runs:

* all supported LTS JVMs from `jvmVersionForCompilation` up to `maximumSupportedJvmVersion`
* `maximumSupportedJvmVersion` as well, even if it is not an LTS release

If `jvmVersionForCompilation` itself is one of those versions, the dedicated `testWithJvmXX` task for that version is disabled and the regular `test` task is used instead.

## Configuration Reference

```kotlin
multiJvm {
    jvmVersionForCompilation.set(17)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
    excludeSupportFor(18, 19)
    testByDefaultWith(17, 21)
    // or:
    testByDefaultWith(supportedLtsVersionsAndLatest)
    println(latestJava)
    println(latestLts)
    println(allLtsVersions)
    println(oldestJavaSupportedByGradle)
    println(latestJavaSupportedByGradle)
    println(supportedJvmVersions.get())
    println(supportedLtsVersions.get())
    println(supportedLtsVersionsAndLatest.get())
}
```

Meaning of the main properties:

* `jvmVersionForCompilation`: JVM used for compilation and for the base `test` task
* `maximumSupportedJvmVersion`: highest JVM version your project claims to support
* `supportedJvmVersions`: all supported JVMs in the inclusive range `jvmVersionForCompilation..maximumSupportedJvmVersion`, minus excluded versions
* `supportedLtsVersions`: supported JVMs that are LTS releases
* `supportedLtsVersionsAndLatest`: `supportedLtsVersions` plus `maximumSupportedJvmVersion`
* `testByDefaultWith(...)`: selects which JVM-specific test tasks `check` should run by default
* `excludeSupportFor(...)`: removes versions from the supported set

## Task Behavior

Some details matter in practice:

* `testWithJvmXX` tasks are created for all known Java versions, not only for the ones you support
* `check` only depends on the versions selected by `testByDefaultWith(...)`
* `check` also depends on `testWithLtsJvms` when all supported LTS versions between `jvmVersionForCompilation` and `maximumSupportedJvmVersion` are enabled
* `check` also depends on `testWithLatestJvm` and `testWithLtsAndLatestJvms` when `latestJava` is part of the supported set
* if a toolchain is unavailable for the current operating system, the corresponding `testWithJvmXX` task is disabled

## Example Policies

Test only the compilation JVM and the latest JVM supported by Gradle:

```kotlin
multiJvm {
    jvmVersionForCompilation.set(17)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
    testByDefaultWith(jvmVersionForCompilation.get(), latestJavaSupportedByGradle)
}
```

Test only LTS releases up to Java 21:

```kotlin
multiJvm {
    jvmVersionForCompilation.set(8)
    maximumSupportedJvmVersion.set(21)
    testByDefaultWith(supportedLtsVersionsAndLatest)
}
```

## Configuration Avoidance

This plugin uses Gradle's [configuration avoidance API](https://docs.gradle.org/current/userguide/task_configuration_avoidance.html).
Your build should do the same when configuring `Test` tasks.

This is unsafe:

```kotlin
// Broken: this eagerly configures Test tasks before multiJvm is configured.
tasks.withType<Test> {
    useJUnitPlatform()
}

multiJvm {
    jvmVersionForCompilation.set(latestJavaSupportedByGradle)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}
```

This is correct:

```kotlin
multiJvm {
    jvmVersionForCompilation.set(latestJavaSupportedByGradle)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
```
