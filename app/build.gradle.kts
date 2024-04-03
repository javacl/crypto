plugins {
    alias(libs.plugins.crypto.android.application)
    alias(libs.plugins.crypto.android.test)
    alias(libs.plugins.crypto.android.compose.application)
    alias(libs.plugins.crypto.android.hilt)
    alias(libs.plugins.crypto.android.lifecycle)
}

android {
    namespace = libs.versions.projectApplicationId.get()

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            applicationIdSuffix = ".trial"
        }
        debug {
            applicationIdSuffix = ".debug"
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
