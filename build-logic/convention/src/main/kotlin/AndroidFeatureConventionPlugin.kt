import crypto.catalog.cryptoAndroidCoilPlugin
import crypto.catalog.cryptoAndroidComposeLibraryPlugin
import crypto.catalog.cryptoAndroidHiltPlugin
import crypto.catalog.cryptoAndroidLibraryPlugin
import crypto.catalog.cryptoAndroidLifecyclePlugin
import crypto.catalog.cryptoAndroidTestPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {

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
            apply(cryptoAndroidComposeLibraryPlugin)
            apply(cryptoAndroidCoilPlugin)
            apply(cryptoAndroidLifecyclePlugin)
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", project(":core:designsystem"))
            add("implementation", project(":core:common"))
        }
    }
}
