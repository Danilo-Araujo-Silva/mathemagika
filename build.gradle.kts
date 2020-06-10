import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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

allprojects {
	repositories {
		flatDir { dirs("$rootDir/plugin", "/Applications/Mathematica.app/Contents/SystemFiles/Links/JLink") }
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

