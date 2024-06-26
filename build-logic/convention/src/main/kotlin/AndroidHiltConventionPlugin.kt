import crypto.catalog.hiltAndroidLibrary
import crypto.catalog.hiltAndroidPlugin
import crypto.catalog.hiltCompilerLibrary
import crypto.catalog.kspPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyPlugins()
            applyDependencies()
        }
    }

    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply(hiltAndroidPlugin)
            apply(kspPlugin)
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", hiltAndroidLibrary)
            add("ksp", hiltCompilerLibrary)
        }
    }
}
