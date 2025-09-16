import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.devtools.ksp")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.compose.feature.call"
    compileSdk = 35
    defaultConfig { minSdk = 24 }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21) // Replace X with your desired JVM version (e.g., JVM_11, JVM_17)
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":core:common"))

    // Compose
    implementation(platform(Deps.composeBom))
    implementation(Deps.composeUi)
    implementation(Deps.composeMaterial3)
    implementation(Deps.composeNavigation)
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

   /* implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":core:common"))
    implementation(project(":core:webrtc"))

    // Hilt
    implementation(Deps.hiltAndroid)
    ksp(Deps.hiltCompiler)

    // Compose
    implementation(platform(Deps.composeBom))
    implementation(Deps.composeUi)
    implementation(Deps.composeMaterial3)
    implementation(Deps.composeNavigation)
    debugImplementation(Deps.composeTooling)

    // Coroutines
    implementation(Deps.coroutinesCore)
    implementation(Deps.coroutinesAndroid)*/

    // Testing
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidxJunit)
    androidTestImplementation(Deps.androidxEspressoCore)
    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(Deps.uiTestJunit4)
    debugImplementation(Deps.uiTestManifest)
}
