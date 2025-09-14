plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.compose.core.network"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    implementation(Deps.retrofit)
    implementation(Deps.retrofitGson)
    implementation(Deps.okhttp)
    implementation(Deps.okhttpLogging)

    implementation(Deps.hiltAndroid)
    ksp(Deps.hiltCompiler)

    implementation(platform(Deps.composeBom))

    // Testing
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidxJunit)
    androidTestImplementation(Deps.androidxEspressoCore)
    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(Deps.uiTestJunit4)
    debugImplementation(Deps.uiTestManifest)
}
