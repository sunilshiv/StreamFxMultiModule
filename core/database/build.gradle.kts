plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.compose.core.database"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    implementation(Deps.roomRuntime)
    implementation(Deps.roomKtx)
    ksp(Deps.roomCompiler)

    implementation(Deps.coroutinesCore)

    implementation(platform(Deps.composeBom))

    // Testing
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidxJunit)
    androidTestImplementation(Deps.androidxEspressoCore)
    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(Deps.uiTestJunit4)
    debugImplementation(Deps.uiTestManifest)
}
