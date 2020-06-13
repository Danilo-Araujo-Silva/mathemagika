import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.lang.IllegalArgumentException

plugins {
	kotlin("multiplatform")
}

buildscript {
	// TODO Due to Gradle limitation we needed to bundle all code of the plugins together.
	apply("plugin/bundle.gradle.kts")

	@Suppress("unchecked_cast", "nothing_to_inline")
	fun <T> uncheckedCast(target: Any?): T = target as T
	val getProperty = uncheckedCast<(keys: List<String>) -> String>(extra["getProperty"])
	val getPropertyOrNull = uncheckedCast<(keys: List<String>) -> String?>(extra["getPropertyOrNull"])
	val getPropertyOrDefault = uncheckedCast<(keys: List<String>, default: String) -> String>(extra["getPropertyOrDefault"])
	val getDependency = uncheckedCast<(group: String, dependencyId: String) -> String>(extra["getDependency"])

	val kotlinVersion = getProperty(listOf("KOTLIN_VERSION", "kotlin.version", "kotlinVersion"))

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

		maven( url = "https://dl.bintray.com/kotlinx/kotlinx" )
		maven( url = "https://kotlin.bintray.com/kotlinx" )
		maven( url = "https://dl.bintray.com/kotlin/kotlin-js-wrappers" )
		maven( url = "https://dl.bintray.com/jetbrains/kotlin-native-dependencies" )
	}

	dependencies {
		// This is important for force Kotlin/Native use the latest Kotlin version.
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

		// TODO See if we can move this only for the module that needs it.
		// This classpath dependency is needed for JVM modules generate fat jars.
		classpath(getDependency("build.gradle.kts", "com.github.jengelman.gradle.plugins:shadow"))

		classpath(getDependency("build.gradle.kts", "org.jetbrains.dokka:dokka-gradle-plugin"))
	}
}

apply("plugin/bundle.gradle.kts")

@Suppress("unchecked_cast", "nothing_to_inline")
fun <T> uncheckedCast(target: Any?): T = target as T
val getProperty = uncheckedCast<(keys: List<String>) -> String>(extra["getProperty"])
val getPropertyOrNull = uncheckedCast<(keys: List<String>) -> String?>(extra["getPropertyOrNull"])
val getPropertyOrDefault = uncheckedCast<(keys: List<String>, default: String) -> String>(extra["getPropertyOrDefault"])

val projectGroup = getProperty(listOf("project.group"))
val projectVersion = getProperty(listOf("project.version"))

allprojects {
	group = projectGroup
	version = projectVersion
	repositories {
		flatDir {
			dirs(
				"$rootDir/plugin",
				getMathematicaJLinkHome()
			)
		}
		mavenLocal()
		gradlePluginPortal()
		mavenCentral()
		jcenter()
		google()
		maven( url = "https://plugins.gradle.org/m2" )
		maven( url = "https://repo.gradle.org/gradle/libs-releases-local" )
		maven( url = "https://dl.bintray.com/kotlin/kotlin-eap" )
		// maven( url = "https://dl.bintray.com/kotlin/kotlin-dev" )
	}
}

/**
 * Using `-Xskip-metadata-version-check` we avoid problems when using the most recent kotlin versions.
 */
tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xskip-metadata-version-check")
	}
}

fun getMathematicaJLinkHome(): String {
	var jlinkHome = getPropertyOrNull(listOf("JLINK_HOME"))
	if (jlinkHome == null) {
		val os = org.gradle.internal.os.OperatingSystem.current()
		when {
			os.isMacOsX() -> {
				jlinkHome = "/Applications/Mathematica.app/Contents/SystemFiles/Links/JLink"
			}
			os.isLinux() -> {
				// TODO Define a default path
			}
			os.isWindows() -> {
				// TODO Define a default path
			}
		}
	}

	if (jlinkHome == null) throw IllegalArgumentException(
		"It was not possible to automatically identify the path to the JLink.jar library. Try to set the environment variable JLINK_HOME."
	)

	return jlinkHome
}

