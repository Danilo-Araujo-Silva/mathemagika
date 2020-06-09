import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	`kotlin-dsl`
}

// TODO Due to Gradle limitation we needed to bundle all code of the plugins together.
apply("../plugin/bundle.gradle.kts")

@Suppress("unchecked_cast", "nothing_to_inline")
inline fun <T> uncheckedCast(target: Any?): T = target as T

val getProperty = uncheckedCast<(key: String) -> String>(extra["getProperty"])
val getDependency = uncheckedCast<(group: String, dependencyId: String) -> String>(extra["getDependency"])
val getDependencyVersion = uncheckedCast<(group: String, dependencyId: String) -> String>(extra["getDependencyVersion"])

repositories {
	flatDir { dirs("plugin") }
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

dependencies {
	// For extending Gradle classes
	implementation(gradleApi())

	// For exteding the Gradle Kotlin plugin classes. The current kotlin version should be grabbed.
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")

	// For Jackson support
	implementation(getDependency("buildSrc/build.gradle.kts", "com.fasterxml.jackson.core:jackson-databind"))
	implementation(getDependency("buildSrc/build.gradle.kts", "com.fasterxml.jackson.module:jackson-module-kotlin"))
//	implementation(getDependency("buildSrc/build.gradle.kts", "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml"))

	// For buildSrc tests
	testImplementation(getDependency("buildSrc/build.gradle.kts", "junit:junit"))
}

/**
 * Using `-Xskip-metadata-version-check` we avoid problems when using the most recent kotlin versions.
 */
tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xskip-metadata-version-check")
	}
}
