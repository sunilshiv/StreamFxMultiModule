plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.compose.core.webrtc"
    compileSdk = 35
    defaultConfig { minSdk = 24 }
}

dependencies {
    implementation(Deps.webrtc)
    implementation(Deps.coroutinesCore)
}
