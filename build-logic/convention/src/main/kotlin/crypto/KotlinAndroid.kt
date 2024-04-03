package crypto

import com.android.build.api.dsl.CommonExtension
import crypto.catalog.coreKtxLibrary
import crypto.catalog.coroutinesAndroidLibrary
import crypto.catalog.projectCompileSdk
import crypto.catalog.projectMinSdk
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureKotlinAndroid(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    val javaVersion = JavaVersion.VERSION_1_8

    commonExtension.apply {

        compileSdk = projectCompileSdk

        defaultConfig {
            minSdk = projectMinSdk
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            vectorDrawables {
                useSupportLibrary = true
            }
        }

        compileOptions {
            sourceCompatibility = javaVersion
            targetCompatibility = javaVersion
        }

        kotlinOptions {
            jvmTarget = javaVersion.toString()
        }

        buildFeatures {
            buildConfig = true
        }

        dependencies {
            add("implementation", coreKtxLibrary)
            add("implementation", coroutinesAndroidLibrary)
        }

        testOptions {
            unitTests {
                isIncludeAndroidResources = true
                isReturnDefaultValues = true
            }
            unitTests.all {
                it.useJUnitPlatform()
            }
        }
    }
}
