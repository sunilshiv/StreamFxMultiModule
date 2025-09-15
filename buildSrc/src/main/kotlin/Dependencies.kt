object Versions {

    //agp
    const val agp = "8.7.2"

    //compose
    const val compose = "2.0.20"

    // Core
    const val kotlin = "2.2.10"
    const val gradle = "8.7.2"

    // Compose
    const val composeBom = "2024.09.01"
    const val composeCompiler = "1.7.0"

    // Hilt
    const val hilt = "2.56.2"

    // KSP
    const val ksp = "2.1.20-1.0.27"

    // Coroutines
    const val coroutines = "1.9.0"

    // AndroidX
    const val lifecycle = "2.8.4"
    const val activityCompose = "1.9.2"

   // network
    const val retrofit = "2.11.0"
    const val okhttp = "4.12.0"

    // Persistence
    const val room = "2.6.1"
    const val datastore = "1.1.1"

    // Background
    const val work = "2.9.0"

    /*const val webrtc = "1.0.32006"*/
    const val webrtc = "137.7151.03" //https://github.com/webrtc-sdk/android
    const val navigation = "2.8.0"

    //test versions
    const val junit = "4.13.2"
    const val junitVersion = "1.1.5"
    const val espressoCore = "3.5.1"
}

object Deps {

    //

    // Compose
    const val activityCompose =
        "androidx.activity:activity-compose:${Versions.activityCompose}"

    // KSP (for Room, DataStore, etc.)
    const val ksp = "com.google.devtools.ksp:symbol-processing-api:${Versions.ksp}"

    // Lifecycle
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    // Kotlin
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // Hilt
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"

    // Retrofit + OkHttp
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    // Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    // DataStore
    const val datastore = "androidx.datastore:datastore-preferences:${Versions.datastore}"

    // WorkManager
    const val work = "androidx.work:work-runtime-ktx:${Versions.work}"

    // WebRTC
   /* const val webrtc = "org.webrtc:google-webrtc:${Versions.webrtc}"*/
    const val webrtc = "io.github.webrtc-sdk:android:${Versions.webrtc}"

    // Compose
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}" //
    const val composeUi = "androidx.compose.ui:ui"
    const val composeMaterial3 = "androidx.compose.material3:material3"
    const val composeTooling = "androidx.compose.ui:ui-tooling"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    const val composeCompiler = "org.jetbrains.kotlin.plugin.compose:${Versions.compose}"

    //Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.junitVersion}"
    const val androidxEspressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
}
