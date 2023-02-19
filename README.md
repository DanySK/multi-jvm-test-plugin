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
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
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