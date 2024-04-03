import crypto.androidGradle
import crypto.catalog.androidLibraryPlugin
import crypto.catalog.kotlinAndroidPlugin
import crypto.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyPlugins()
            androidGradle {
                configureKotlinAndroid(this)
                defaultConfig {
                    consumerProguardFiles("consumer-rules.pro")
                }
            }
        }
    }

    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply(androidLibraryPlugin)
            apply(kotlinAndroidPlugin)
        }
    }
}
