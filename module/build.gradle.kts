plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
//    kotlin("jvm")

    id("com.apollographql.apollo3")
}

android {
    namespace = "com.example.feature1"
    compileSdk = 33

    defaultConfig {
        minSdk = 23
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")

    testImplementation("junit:junit:4.13.2")
}

apollo {
    service("service") {
        packageName.set("com.example")
    }
}
