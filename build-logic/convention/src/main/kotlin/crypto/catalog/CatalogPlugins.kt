package crypto.catalog

import crypto.libs
import org.gradle.api.Project

val Project.androidApplicationPlugin
    get() = libs.findPlugin("android-application").get().get().pluginId.toString()

val Project.androidLibraryPlugin
    get() = libs.findPlugin("android-library").get().get().pluginId.toString()

val Project.kotlinAndroidPlugin
    get() = libs.findPlugin("kotlin-android").get().get().pluginId.toString()

val Project.hiltAndroidPlugin
    get() = libs.findPlugin("hilt-android").get().get().pluginId.toString()

val Project.kspPlugin
    get() = libs.findPlugin("ksp").get().get().pluginId.toString()

val Project.roomPlugin
    get() = libs.findPlugin("room").get().get().pluginId.toString()

val Project.kotlinxSerializationPlugin
    get() = libs.findPlugin("kotlinx-serialization").get().get().pluginId.toString()


// Plugins defined by this project
val Project.cryptoAndroidLibraryPlugin
    get() = libs.findPlugin("crypto-android-library").get().get().pluginId.toString()

val Project.cryptoAndroidComposeLibraryPlugin
    get() = libs.findPlugin("crypto-android-compose-library").get().get().pluginId.toString()

val Project.cryptoAndroidHiltPlugin
    get() = libs.findPlugin("crypto-android-hilt").get().get().pluginId.toString()

val Project.cryptoAndroidTestPlugin
    get() = libs.findPlugin("crypto-android-test").get().get().pluginId.toString()

val Project.cryptoAndroidCoilPlugin
    get() = libs.findPlugin("crypto-android-coil").get().get().pluginId.toString()

val Project.cryptoAndroidLifecyclePlugin
    get() = libs.findPlugin("crypto-android-lifecycle").get().get().pluginId.toString()
