plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.compose.core.datastore"
    compileSdk = 35
    defaultConfig { minSdk = 24 }
}

dependencies {
    implementation(Deps.datastore)
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
