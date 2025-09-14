plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.compose.data"
    compileSdk = 35
    defaultConfig { minSdk = 24 }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":core:network"))
    implementation(project(":core:database"))
    implementation(project(":core:datastore"))
    implementation(project(":core:webrtc"))

    implementation(Deps.hiltAndroid)
    ksp(Deps.hiltCompiler)

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
