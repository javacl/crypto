import crypto.catalog.lifecycleRuntimeKtxLibrary
import crypto.catalog.lifecycleViewModelKtxLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidLifecycleConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.run {
            applyDependencies()
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", lifecycleRuntimeKtxLibrary)
            add("implementation", lifecycleViewModelKtxLibrary)
        }
    }
}
