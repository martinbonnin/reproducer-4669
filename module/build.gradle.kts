plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}


val output = file("build/generated/sources/other")

val codegenTask = tasks.register("generateSources") {
    val input = file("src/other")
    inputs.dir(input)
    outputs.dir(output)
    doLast {
        input.copyRecursively(output, true)
    }
}

project.android.testVariants.all {
    this.registerJavaGeneratingTask(codegenTask, output)
}

project.android.unitTestVariants.all {
    this.registerJavaGeneratingTask(codegenTask, output)
}

project.android.libraryVariants.all {
    this.registerJavaGeneratingTask(codegenTask, output)
}

android {
    namespace = "com.example.feature1"
    compileSdk = 33

    defaultConfig {
        minSdk = 23
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
