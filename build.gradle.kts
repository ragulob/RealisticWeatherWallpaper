plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.example.weatherwallpaper"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.example.weatherwallpaper"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
