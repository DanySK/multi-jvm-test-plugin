# Multi-JVM testing for Gradle

This plugin automatically configures a Java (or Kotlin, or other plugins applying Java) build to run tests under multiple versions of the JVM.
It exposes support to decide on which JVM to compile code,
pre-configures the `test` task to run on the same JVM,
and creates the following additional tasks:
* `testWithJvmXXX`, where `XXX` is the version of a supported JVM, e.g., 16, one such task is created for each version of the JVM that the project supports;
* `testWithLatestJvm`, that runs tests with the latest known JVM;
* `testWithLtsJvms`, that runs tests with all the known LTS versions of the JVM;
* `testWithLtsAndLatestJvms`, that runs both `testWithLatestJvm` and `testWithLtsJvms`

A set of all tasks can be selected in configuration,
and will be associated to the `check` task for being run by default.
If there is only one task of type `test`, it will be preconfigured to use the same JVM used for compiling code.

## Configuration

To provision the missing JVMs automatically, you should enable `org.gradle.toolchains.foojay-resolver-convention`
in your `settings.gradle.kts`:

```kotlin
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "<LATEST VERSION IS RECOMMENDED>"
}
```

By default, the plugin compiles with Java 8,
and tests with all the LTS versions from Java 8 onwards,
plus with the most recent Java version.

This behaviour can be changed as follows in your `build.gradle.kts`:

```kotlin
plugins {
    id("org.danilopianini.multi-jvm-test-plugin") version "<VERSION_YOU_WANT>" 
}

multiJvm {
    jvmVersionForCompilation.set(8) // Select the version you want to compile with
    maximumSupportedJvmVersion.set(latestJava) // Select the latest version of the JVM you intend to support
    excludeSupportFor(10) // It is possible to exclude one or more versions from the set of supported JVMs
    println(latestJava) // latestJava returns the newest known version of Java
    println(allLtsVersions) // allLtsVersions returns all the known LTS versions of Java
    println(latestJavaSupportedByGradle) // latestJavaSupportedByGradle is the latest Java version supported by the running version of Gradle
    testByDefaultWith(supportedLtsVersionsAndLatest) // this method can be called with other parameters to change wich JVMs should be used by default for tests
}
```

## Beware of configuration avoidance

This plugin uses Gradle's [configuration avoidance API](https://docs.gradle.org/current/userguide/task_configuration_avoidance.html)
to improve performance.
A con of this approach is that the plugin expects the task configuration to be done using the same api.
In particular, configurations like this one *will* fail:

```kotlin
// THIS IS BROKEN, DO NOT DO THIS
tasks.withType<Test> {
    useJUnitPlatform()
}
// IT IS BROKEN, DON'T COPY AND PASTE THIS CODE WITHOUT READING THE COMMENT ABOVE
multiJvm {
    jvmVersionForCompilation.set(latestJavaSupportedByGradle)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}
```

As gradle will run the task configuration for `Test` tasks before the plugin's extension has been configured.
To solve, there are two options:
1. configure the extension **before** any other task configuration;
2. use the configuration avoidance API to configure the tasks.

The two things are not mutually exclusive, rather,
it is recommended to do *both*:

```kotlin
multiJvm {
    jvmVersionForCompilation.set(latestJavaSupportedByGradle)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}
tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
```
