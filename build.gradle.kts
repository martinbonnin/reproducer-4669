plugins {
    kotlin("jvm") version "1.7.10" apply false
    kotlin("android") version "1.7.10" apply false
//    id("com.apollographql.apollo3") version "3.7.5-SNAPSHOT" apply false
    id("com.apollographql.apollo3") version "3.7.4" apply false
    id("com.android.application") version "7.4.1" apply false
    id("com.android.library") version "7.4.1" apply false
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}
