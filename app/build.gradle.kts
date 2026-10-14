plugins {
    alias(libs.plugins.android.application)
    id("androidx.navigation.safeargs.kotlin")   // Safe Args: must be below android.application
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")                           // needed for Data Binding
}

android {
    namespace = "com.example.tenantmanagementsystemgroupa"   // use your own package name
    compileSdk = 36                                          // keep whatever yours already has

    defaultConfig {
        applicationId = "com.example.tenantmanagementsystemgroupa"   // keep yours
        minSdk = 24                                                  // keep yours
        targetSdk = 36                                               // keep yours
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    // Navigation Component (Practical 2)
    implementation("androidx.navigation:navigation-fragment-ktx:2.9.8")
    implementation("androidx.navigation:navigation-ui-ktx:2.9.8")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}