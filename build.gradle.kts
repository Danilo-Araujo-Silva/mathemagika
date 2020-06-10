import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.nativeplatform.platform.OperatingSystem.isLinux
import org.gradle.nativeplatform.platform.OperatingSystem.isWindows
import org.gradle.nativeplatform.platform.OperatingSystem.isMacOsX
import java.lang.IllegalArgumentException

plugins {
	kotlin("multiplatform")
}

buildscript {
	// TODO Due to Gradle limitation we needed to bundle all code of the plugins together.
	apply("plugin/bundle.gradle.kts")

	@Suppress("unchecked_cast", "nothing_to_inline")
	fun <T> uncheckedCast(target: Any?): T = target as T
	val getProperty = uncheckedCast<(key: String) -> String>(extra["getProperty"])
	val getDependency = uncheckedCast<(group: String, dependencyId: String) -> String>(extra["getDependency"])

	val kotlinVersion = getProperty("kotlin.version")

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
		// TODO See if we can move this only for the module that needs it.
		// This classpath dependency is needed for JVM modules generate fat jars.
		classpath(getDependency("build.gradle.kts", "com.github.jengelman.gradle.plugins:shadow"))
	}
}

apply("plugin/bundle.gradle.kts")

@Suppress("unchecked_cast", "nothing_to_inline")
fun <T> uncheckedCast(target: Any?): T = target as T
val getPropertyOrDefault = uncheckedCast<(vararg keys: String, default: String) -> String>(extra["getPropertyOrDefault"])

allprojects {
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
	var jlinkHome = getProperty("JLINK_HOME")
	if (jlinkHome == null) jlinkHome = getProperty("jlink.home")
	if (jlinkHome == null) jlinkHome = getProperty("jLinkHome")
	if (jlinkHome == null) {
		if (isMacOsX()) {
			jlinkHome = "/Applications/Mathematica.app/Contents/SystemFiles/Links/JLink"
		} else if (isLinux()) {
			// TODO Define a default path
		} else if (isWindows()) {
			// TODO Define a default path
		}
	}

	if (jlinkHome == null) throw IllegalArgumentException(
		"It was not possible to automatically identify the path to the JLink.jar library. Try to set the environment variable JLINK_HOME."
	)

	return jlinkHome
}

