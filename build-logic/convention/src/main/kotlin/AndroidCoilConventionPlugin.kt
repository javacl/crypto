import crypto.catalog.coilComposeLibrary
import crypto.catalog.coilGifLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidCoilConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyDependencies()
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", coilComposeLibrary)
            add("implementation", coilGifLibrary)
        }
    }
}
