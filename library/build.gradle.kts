import groovy.util.Node
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import com.github.jengelman.gradle.plugins.shadow.ShadowExtension

plugins {
	kotlin("multiplatform")
	id("com.github.johnrengelman.shadow")
	id("maven-publish")
	id("java")
//	id("signing")
}

kotlin {
//	androidNativeArm32 {
//	}
//
//	androidNativeArm64 {
//	}
//
//	iosArm32 {
//		binaries {
//			framework {}
//		}
//	}
//
//	iosArm64 {
//		binaries {
//			framework {}
//		}
//	}
//
//	iosX64 {
//		binaries {
//			framework {}
//		}
//	}
//
//	js {
//		browser {
//		}
//
//		nodejs {
//		}
//	}

	jvm {
	}

//	linuxArm32Hfp {
//	}
//
//	linuxMips32 {
//	}
//
//	linuxMipsel32 {
//	}
//
//	linuxX64 {
//	}
//
//	macosX64 {
//	}
//
//	mingwX64 {
//	}
//
//	wasm32 {
//	}

	sourceSets {
		val commonMain by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "common")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "common")))

			dependencies {
				implementation(project(":common"))
				implementation(kotlin("stdlib-common"))
			}
		}

		val commonTest by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "common")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "common")))

			dependencies {
				implementation(kotlin("test-common"))
				implementation(kotlin("test-annotations-common"))
			}
		}
//
//		val nativeMain by creating {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "native")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "native")))
//
//			dependsOn(commonMain)
//		}
//		val nativeTest by creating {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "native")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "native")))
//
//			dependsOn(commonTest)
//		}
//
//		val androidNativeArm32Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "android_native_arm32")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "android_native_arm32")))
//
//			dependsOn(nativeMain)
//		}
//		val androidNativeArm32Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "android_native_arm32")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "android_native_arm32")))
//
//			dependsOn(nativeTest)
//		}
//
//		val androidNativeArm64Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "android_native_arm64")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "android_native_arm64")))
//
//			dependsOn(nativeMain)
//		}
//		val androidNativeArm64Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "android_native_arm64")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "android_native_arm64")))
//
//			dependsOn(nativeTest)
//		}
//
//		val iosArm32Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "ios_arm32")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "ios_arm32")))
//
//			dependsOn(nativeMain)
//		}
//		val iosArm32Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "ios_arm32")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "ios_arm32")))
//
//			dependsOn(nativeTest)
//		}
//
//		val iosArm64Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "ios_arm64")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "ios_arm64")))
//
//			dependsOn(nativeMain)
//		}
//		val iosArm64Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "ios_arm64")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "ios_arm64")))
//
//			dependsOn(nativeTest)
//		}
//
//		val iosX64Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "ios_x64")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "ios_x64")))
//
//			dependsOn(nativeMain)
//		}
//		val iosX64Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "ios_x64")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "ios_x64")))
//
//			dependsOn(nativeTest)
//		}
//
//		val jsMain by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "js")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "js")))
//
//			dependencies {
//				implementation(kotlin("stdlib-js"))
//			}
//		}
//		val jsTest by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "js")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "js")))
//
//			dependencies {
//				implementation(kotlin("test-js"))
//			}
//		}

		val jvmMain by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "jvm")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "jvm")))

			dependencies {
				implementation(project(":common"))
				implementation(kotlin("stdlib-jdk8"))
				implementation(kotlin("reflect"))
				implementation(mapOf("name" to "JLink"))
			}
		}
		val jvmTest by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "jvm")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "jvm")))

			dependencies {
				implementation(kotlin("test"))
				implementation(kotlin("test-junit"))
			}
		}

//		val linuxArm32HfpMain by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_arm32_hfp")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_arm32_hfp")))
//
//			dependsOn(nativeMain)
//		}
//		val linuxArm32HfpTest by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_arm32_hfp")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_arm32_hfp")))
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxMips32Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_mips32")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_mips32")))
//
//			dependsOn(nativeMain)
//		}
//		val linuxMips32Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_mips32")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_mips32")))
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxMipsel32Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_mipsel32")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_mipsel32")))
//
//			dependsOn(nativeMain)
//		}
//		val linuxMipsel32Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_mipsel32")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_mipsel32")))
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxX64Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_x64")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_x64")))
//
//			dependsOn(nativeMain)
//		}
//		val linuxX64Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_x64")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_x64")))
//
//			dependsOn(nativeTest)
//		}
//
//		val macosX64Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "macos_x64")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "macos_x64")))
//
//			dependsOn(nativeMain)
//		}
//		val macosX64Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "macos_x64")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "macos_x64")))
//
//			dependsOn(nativeTest)
//		}
//
//		val mingwX64Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "mingw_x64")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "mingw_x64")))
//
//			dependsOn(nativeMain)
//		}
//		val mingwX64Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "mingw_x64")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "mingw_x64")))
//
//			dependsOn(nativeTest)
//		}
//
//		val wasm32Main by getting {
//			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "wasm32")))
//			resources.setSrcDirs(listOf(getPath("main", "resources", "wasm32")))
//
//			dependsOn(nativeMain)
//		}
//		val wasm32Test by getting {
//			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "wasm32")))
//			resources.setSrcDirs(listOf(getPath("test", "resources", "wasm32")))
//
//			dependsOn(nativeTest)
//		}
	}
}

/**
 *
 */
fun getPath(compilation: String, type: String, name: String): String {
	return if (type == "kotlin")
		if (name == "common")
			"src/$compilation/$type/com/daniloaraujosilva/mathemagika/library/$name"
		else
			"src/$compilation/$type/com/daniloaraujosilva/mathemagika/library/$name/common"
	else
		"src/$compilation/$type/$name"
}

publishing {
	repositories {
		mavenLocal()
	}
}

// Add a Javadoc JAR to each publication as required by Maven Central

val javadocJar by tasks.creating(Jar::class) {
	archiveClassifier.value("javadoc")
	// TODO: instead of a single empty Javadoc JAR, generate real documentation
}

publishing {
	publications.withType<MavenPublication>().all {
		artifact(javadocJar)
	}
}

//// The root publication also needs a sources JAR as it does not have one by default

val sourcesJar by tasks.creating(Jar::class) {
	archiveClassifier.value("sources")
}

publishing.publications.withType<MavenPublication>().getByName("kotlinMultiplatform").artifact(sourcesJar)

//// Customize the POMs adding the content required by Maven Central

fun customizeForMavenCentral(pom: org.gradle.api.publish.maven.MavenPom) = pom.withXml {
	fun Node.add(key: String, value: String) {
		appendNode(key).setValue(value)
	}

	fun Node.node(key: String, content: Node.() -> Unit) {
		appendNode(key).also(content)
	}

	asNode().run {
		add("description", "Mathemagika is a magic wand to unify the worlds of mathematics and programming.")
		add("name", "Mathemagika")
		add("url", "https://github.com/daniloaraujosilva/mathemagika")
		node("organization") {
			add("name", "com.daniloaraujosilva")
			add("url", "https://github.com/daniloaraujosilva")
		}
		node("issueManagement") {
			add("system", "github")
			add("url", "https://github.com/daniloaraujosilva/mathemagika/issues")
		}
		node("licenses") {
			node("license") {
				add("name", "Apache License 2.0")
				add("url", "https://github.com/daniloaraujosilva/mathemagika/blob/master/license.md")
				add("distribution", "repo")
			}
		}
		node("scm") {
			add("url", "https://github.com/daniloaraujosilva/mathemagika")
			add("connection", "scm:git:git://github.com/daniloaraujosilva/mathemagika.git")
			add("developerConnection", "scm:git:ssh://github.com/daniloaraujosilva/mathemagika.git")
		}
		node("developers") {
			node("developer") {
				add("name", "Danilo Araújo Silva")
			}
		}
	}
}

//// Sign the publications:

////// Also requires that signing.keyId, signing.password, and signing.secretKeyRingFile are provided as Gradle
////// properties.

////// No complex signing configuration is required here, as the signing plugin interoperates with maven-publish
////// and can simply add the signature files directly to the publications:

// publishing {
//     publications.withType<MavenPublication>().all {
//         signing.sign(this@all)
//     }
// }

//tasks.withType<Jar> {
//	from ({
//		configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
//	})
//}

val shadowJar = tasks.withType<ShadowJar> {
	archiveClassifier.set("")

	// Assuming just one target.
	val target = kotlin.targets.iterator().next()
	from(target.compilations["main"].output)
	val runtimeClasspath = target.compilations["main"].compileDependencyFiles as Configuration
	configurations = mutableListOf(runtimeClasspath)

	dependencies {
		include(dependency(":common"))
	}
}

publishing {
	publications {
		create<MavenPublication>("mavenLocal") {
			artifactId = "jvm"

			shadow.component(this)
		}
		publications.withType<MavenPublication>().all {
			customizeForMavenCentral(pom)
		}
	}
}
