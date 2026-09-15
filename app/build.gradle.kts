plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.zaad.admin"
    compileSdk = 35

    defaultConfig {
        applicationId =  "com.zaad.admin"
        minSdk = 24
        targetSdk = 35
        versionCode = 2
        versionName = "1.1"
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.7.0"))
    implementation("com.google.firebase:firebase-messaging")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.12.1")
}
