import crypto.applicationGradle
import crypto.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidComposeApplicationConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applicationGradle {
                configureAndroidCompose(this)
            }
        }
    }
}
