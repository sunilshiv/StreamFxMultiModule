import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.devtools.ksp")
    id("org.jetbrains.kotlin.plugin.compose")
}


android {
    namespace = "com.compose.streamfx"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.compose.streamfx"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21) // Replace X with your desired JVM version (e.g., JVM_11, JVM_17)
        }

        buildFeatures {
            compose = true
        }
        composeOptions {
            kotlinCompilerExtensionVersion = Versions.composeCompiler
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

  /*  implementation(libs.symbol.processing.api)*/

    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":core:common"))
    implementation(project(":core:network"))
    implementation(project(":core:database"))
    implementation(project(":core:datastore"))
    implementation(project(":core:webrtc"))

    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":core:common"))

    // Compose
    implementation(platform(Deps.composeBom))
    implementation(Deps.composeUi)
    implementation(Deps.composeMaterial3)
    implementation(Deps.composeNavigation)
    implementation(Deps.activityCompose)
    debugImplementation(Deps.composeTooling)

    // Hilt
    implementation(Deps.hiltAndroid)
    kapt(Deps.hiltCompiler)

    // Coroutines
    implementation(Deps.coroutinesCore)
    implementation(Deps.coroutinesAndroid)

    // Lifecycle
    implementation(Deps.lifecycleViewModel)
    implementation(Deps.lifecycleRuntime)

  /*  // Hilt
    implementation("com.google.dagger:hilt-android:2.57.1")         // latest stable
    ksp("com.google.dagger:hilt-android-compiler:2.57.1")           // match
    ksp("androidx.hilt:hilt-compiler:1.3.0")*/
    /* implementation(Deps.hiltAndroid)
     ksp(Deps.hiltCompiler)*/



   /* // Core & Lifecycle
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Jetpack Compose
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // Navigation
    implementation(libs.androidx.navigation.compose)

    // Retrofit & OkHttp (Networking)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.logging.interceptor)

    // Room (Database)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)

    // Coil (Image Loading)
    implementation(libs.coil.compose)

    // ExoPlayer (Media Playback)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.ui)
    implementation(libs.androidx.media3.exoplayer.dash)
    implementation(libs.androidx.media3.exoplayer.hls)*/

    // Testing
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidxJunit)
    androidTestImplementation(Deps.androidxEspressoCore)
    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(Deps.uiTestJunit4)
    debugImplementation(Deps.uiTestManifest)
}