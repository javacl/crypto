import crypto.catalog.cryptoAndroidHiltPlugin
import crypto.catalog.cryptoAndroidLibraryPlugin
import crypto.catalog.cryptoAndroidTestPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidDomainConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyPlugins()
            applyDependencies()
        }
    }

    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply(cryptoAndroidLibraryPlugin)
            apply(cryptoAndroidTestPlugin)
            apply(cryptoAndroidHiltPlugin)
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", project(":core:common"))
        }
    }
}
