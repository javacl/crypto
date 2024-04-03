import crypto.catalog.androidxJunitLibrary
import crypto.catalog.espressoCoreLibrary
import crypto.catalog.junitLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidTestConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyDependencies()
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("testImplementation", junitLibrary)
            add("androidTestImplementation", androidxJunitLibrary)
            add("androidTestImplementation", espressoCoreLibrary)
        }
    }
}
