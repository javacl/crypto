import crypto.applicationGradle
import crypto.catalog.androidApplicationPlugin
import crypto.catalog.kotlinAndroidPlugin
import crypto.catalog.projectApplicationId
import crypto.catalog.projectTargetSdk
import crypto.catalog.projectVersionCode
import crypto.catalog.projectVersionName
import crypto.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyPlugins()
            applicationGradle {
                configureKotlinAndroid(this)
                defaultConfig {
                    applicationId = projectApplicationId
                    targetSdk = projectTargetSdk
                    versionCode = projectVersionCode
                    versionName = projectVersionName
                }
            }
        }
    }

    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply(androidApplicationPlugin)
            apply(kotlinAndroidPlugin)
        }
    }
}
