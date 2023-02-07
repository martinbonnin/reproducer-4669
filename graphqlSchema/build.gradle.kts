plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.apollographql.apollo3")
}

android {
    namespace = "com.example.graphqlschema"
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
    testImplementation(kotlin("test"))
}

apollo {
    service("service-a") {
        generateApolloMetadata.set(true)
        sourceFolder.set("servicea")
        packageName.set("com.example.servicea")

        // The 'Date' scalar is used in feature1 and feature2, which would normally generate it once in each
        // module, which would clash. So we force generating in this module instead. 
        // See https://www.apollographql.com/docs/kotlin/advanced/multi-modules/#type-clashes
        alwaysGenerateTypesMatching.set(listOf("Date"))


        schemaFiles.from(
            file("src/main/graphql/servicea/schema.graphqls"),
            file("src/main/graphql/servicea/extra.graphqls")
        )
    }

    service("service-b") {
        generateApolloMetadata.set(true)
        sourceFolder.set("serviceb")

        packageName.set("com.example.serviceb")

        // The 'Date' scalar is used in feature1 and feature2, which would normally generate it once in each
        // module, which would clash. So we force generating in this module instead. 
        // See https://www.apollographql.com/docs/kotlin/advanced/multi-modules/#type-clashes
        alwaysGenerateTypesMatching.set(listOf("Date"))
    }
}
