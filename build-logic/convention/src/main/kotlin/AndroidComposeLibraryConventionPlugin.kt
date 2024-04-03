import crypto.androidGradle
import crypto.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidComposeLibraryConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            androidGradle {
                configureAndroidCompose(this)
            }
        }
    }
}
