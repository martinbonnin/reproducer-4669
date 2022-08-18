plugins {
    kotlin("jvm") version "1.7.10" apply false
    kotlin("android") version "1.7.10" apply false
    id("com.apollographql.apollo3") version "3.5.0" apply false
    id("com.android.application") version "7.2.1" apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
