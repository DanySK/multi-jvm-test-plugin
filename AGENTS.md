# Agent Instructions

## Scope

These instructions apply to the entire repository.

## Build And Validation

- Use the Gradle wrapper for all project tasks.
- Run `./gradlew ktlintFormat` before finishing any Kotlin or Gradle script change.
- Run `./gradlew build` after formatting and before handing work back.
- If a change is narrowly scoped and you need a faster check while iterating, prefer the closest Gradle task such as `test`, `ktlintCheck`, or a specific `testWithJvm<version>` task, but still finish with `./gradlew build`.

## Repository-Specific Rules

- Keep Kotlin compiler warnings at zero. This build treats all warnings as errors.
- Do not bypass the multi-JVM test matrix without a clear reason. If behavior is JVM-version-specific, validate with the relevant `testWithJvm<version>` task.
- When public API changes make ABI checks fail, update the recorded ABI with the repository task intended for that purpose instead of disabling the check.
- Use existing Gradle conventions in `build.gradle.kts`, `settings.gradle.kts`, and version catalog files. Do not introduce alternate build entry points.

## Suppressions And Exceptions

- Treat warning suppressions, detekt suppressions, and similar exceptions as a last resort.
- Every suppression must include a short justification near the suppression site.
- Do not add blanket suppressions, global disables, or build-script exclusions unless the user explicitly asks for that tradeoff.

## When Validation Fails

- If `ktlintFormat` changes files, review the result and rerun `./gradlew build`.
- If `build` fails, fix the issue and rerun it instead of documenting the failure as acceptable unless the user asked for investigation only.
