plugins {
    kotlin("jvm") version "1.7.10" apply false
    kotlin("android") version "1.7.10" apply false
    id("com.android.application") version "8.1.0-alpha03" apply false
    id("com.android.library") version "7.4.1" apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
