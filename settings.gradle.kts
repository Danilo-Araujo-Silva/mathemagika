rootProject.name = "mathemagika"

// TODO Due to Gradle limitation we needed to bundle all code of the plugins together.
apply("plugin/bundle.gradle.kts")
@Suppress("unchecked_cast", "nothing_to_inline")
fun <T> uncheckedCast(target: Any?): T = target as T
val getProperty = uncheckedCast<(keys: List<String>) -> String>(extra["getProperty"])
val getPropertyOrNull = uncheckedCast<(keys: List<String>) -> String?>(extra["getPropertyOrNull"])
val getPropertyOrDefault = uncheckedCast<(keys: List<String>, default: String) -> String>(extra["getPropertyOrDefault"])

pluginManagement {
	repositories {
		flatDir { dirs("$rootDir/plugin") }
		mavenLocal()
		gradlePluginPortal()
		mavenCentral()
		jcenter()
		google()
		maven( url = "https://plugins.gradle.org/m2" )
		maven( url = "https://repo.gradle.org/gradle/libs-releases-local" )
		maven( url = "https://dl.bintray.com/kotlin/kotlin-eap" )
		// maven( url = "https://dl.bintray.com/kotlin/kotlin-dev" )

		// For Kotlin JS modules
		maven( url = "https://dl.bintray.com/salomonbrys/gradle-plugins" )
	}

	resolutionStrategy {
		// TODO Due to Gradle limitation we needed to bundle all code of the plugins together.
		apply("plugin/bundle.gradle.kts")
		@Suppress("unchecked_cast", "nothing_to_inline")
		fun <T> uncheckedCast(target: Any?): T = target as T
		val getProperty = uncheckedCast<(keys: List<String>) -> String>(extra["getProperty"])
		val getPropertyOrNull = uncheckedCast<(keys: List<String>) -> String?>(extra["getPropertyOrNull"])
		val getPropertyOrDefault = uncheckedCast<(keys: List<String>, default: String) -> String>(extra["getPropertyOrDefault"])
		val getDependency = uncheckedCast<(group: String, dependencyId: String) -> String>(extra["getDependency"])

		eachPlugin {
			if (requested.id.id == "kotlin-multiplatform") {
				useModule(getDependency("settings.gradle.kts", "org.jetbrains.kotlin:kotlin-gradle-plugin"))
			}

			// For Kotlin JS modules
			if (requested.id.id.startsWith("com.github.salomonbrys.gradle.kotlin.js")) {
				useModule(getDependency("settings.gradle.kts", "com.github.salomonbrys.gradle.kotlin.js:kotlin-js-gradle-utils"))
			}
		}
	}
}

apply("plugin/initialize.gradle.kts")

println("Using Kotlin ${getProperty(listOf("kotlin.version"))}")

println()
