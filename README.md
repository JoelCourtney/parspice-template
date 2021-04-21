# ParSPICE Java Template
A basic outline for a Gradle Groovy parspice project in Java.

The relevant code can be found in `src/main/java/Main.java`, `src/worker/java/`, and `build.gradle`. A template worker is provided for each Worker type. Pick whichever one you need and delete the rest.

Also, the `.gitignore` was modified to ignore worker output log files. All other files where generated as-is from a new Gradle Java project in IntelliJ.

A `gradle run` task has been added for convenience.