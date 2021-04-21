# ParSPICE Kotlin Template
A basic outline for a Groovy Gradle parspice project in Kotlin. This assumes that the ParSPICE library is installed
and published to the Maven Local repo (see the [main project's readme](https://github.com/JoelCourtney/parspice) for details).

The relevant code can be found in `src/main/java/Main.java`, `src/worker/kotlin/`, and `build.gradle`. A template worker is provided for each Worker type. Pick whichever one you need and delete the rest.

Also, the .gitignore was modified to ignore worker output log files. All other files where generated as-is from a new Gradle Java project in IntelliJ.

A `gradle run` task has been added for convenience.