import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	// TODO Due to Gradle limitation we needed to bundle all code of the plugins together.
	apply("plugin/bundle.gradle.kts")

	@Suppress("unchecked_cast", "nothing_to_inline")
	fun <T> uncheckedCast(target: Any?): T = target as T
	val getProperty = uncheckedCast<(key: String) -> String>(extra["getProperty"])
	val getDependency = uncheckedCast<(group: String, dependencyId: String) -> String>(extra["getDependency"])

	val kotlinVersion = getProperty("kotlin.version")

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

		maven( url = "https://dl.bintray.com/kotlinx/kotlinx" )
		maven( url = "https://kotlin.bintray.com/kotlinx" )
		maven( url = "https://dl.bintray.com/kotlin/kotlin-js-wrappers" )
		maven( url = "https://dl.bintray.com/jetbrains/kotlin-native-dependencies" )

//		// For JS
//		maven( url = "https://dl.bintray.com/salomonbrys/gradle-plugins" )
	}

	dependencies {
//		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
//		classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
//		classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
//
//		// For Terminal modules
//		classpath("com.github.jengelman.gradle.plugins:shadow:5.0.0")
//
//		// For Spring Boot modules
//		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.2.2.RELEASE")
//
//		// For Android modules
//		classpath("com.android.tools.build:gradle:3.3.2")
//		classpath("com.android.tools.build:gradle:3.5.3")
//		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
//
//		// For JavaScript modules
//		classpath("org.jetbrains.kotlin:kotlin-frontend-plugin:0.0.45")
//		classpath("com.github.salomonbrys.gradle.kotlin.js:kotlin-js-gradle-utils:1.2.0")
//
//		// TODO Add reference in the future
////		classpath ("com.company.team.project:plugin-jvm-gradle")
	}
}

allprojects {
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
}

/**
 * Using `-Xskip-metadata-version-check` we avoid problems when using the most recent kotlin versions.
 */
tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xskip-metadata-version-check")
	}
}
