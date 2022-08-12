plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime", "3.5.0")
    implementation(project(":api"))
}
