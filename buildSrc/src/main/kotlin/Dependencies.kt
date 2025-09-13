object Versions {
    const val kotlin = "2.0.0"
    const val coroutines = "1.8.1"
    const val hilt = "2.51.1"
    const val retrofit = "2.11.0"
    const val okhttp = "4.12.0"
    const val room = "2.6.1"
    const val datastore = "1.1.1"
    const val work = "2.9.0"
    /*const val webrtc = "1.0.32006"*/
    const val webrtc = "137.7151.03" //https://github.com/webrtc-sdk/android
    const val composeBom = "2025.01.00"
    const val navigation = "2.8.0"
}

object Deps {
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
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeMaterial3 = "androidx.compose.material3:material3"
    const val composeTooling = "androidx.compose.ui:ui-tooling"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
}
