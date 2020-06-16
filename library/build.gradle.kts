import groovy.util.Node
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import com.jfrog.bintray.gradle.BintrayExtension
import java.util.Date

plugins {
	kotlin("multiplatform")
	id("com.github.johnrengelman.shadow")
	id("maven-publish")
	id("java")
	id("signing")
	id("com.jfrog.bintray")
}

apply("../plugin/bundle.gradle.kts")

@Suppress("unchecked_cast", "nothing_to_inline")
fun <T> uncheckedCast(target: Any?): T = target as T
val getProperty = uncheckedCast<(keys: List<String>) -> String>(extra["getProperty"])
val getPropertyOrNull = uncheckedCast<(keys: List<String>) -> String?>(extra["getPropertyOrNull"])
val getPropertyOrDefault = uncheckedCast<(keys: List<String>, default: String) -> String>(extra["getPropertyOrDefault"])

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

	js {
//		browser {
//		}

		nodejs {
		}
	}

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

	macosX64 {
	}

//	mingwX64 {
//	}
//
//	wasm32 {
//	}

	sourceSets {
		val commonMain by getting {
			configureSourceSet(this, "common")

			dependencies {
				implementation(kotlin("stdlib-common"))
			}
		}

		val commonTest by getting {
			configureSourceSet(this, "common")

			dependencies {
				implementation(kotlin("test-common"))
				implementation(kotlin("test-annotations-common"))
			}
		}

		val nativeMain by creating {
			configureSourceSet(this, "native")

			dependsOn(commonMain)
		}
		val nativeTest by creating {
			configureSourceSet(this, "native")

			dependsOn(commonTest)
		}

//		val androidNativeArm32Main by getting {
//			configureSourceSet(this, "android_native_arm32")
//
//			dependsOn(nativeMain)
//		}
//		val androidNativeArm32Test by getting {
//			configureSourceSet(this, "android_native_arm32")
//
//			dependsOn(nativeTest)
//		}
//
//		val androidNativeArm64Main by getting {
//			configureSourceSet(this, "android_native_arm64")
//
//			dependsOn(nativeMain)
//		}
//		val androidNativeArm64Test by getting {
//			configureSourceSet(this, "android_native_arm64")
//
//			dependsOn(nativeTest)
//		}
//
//		val iosArm32Main by getting {
//			configureSourceSet(this, "ios_arm32")
//
//			dependsOn(nativeMain)
//		}
//		val iosArm32Test by getting {
//			configureSourceSet(this, "ios_arm32")
//
//			dependsOn(nativeTest)
//		}
//
//		val iosArm64Main by getting {
//			configureSourceSet(this, "ios_arm64")
//
//			dependsOn(nativeMain)
//		}
//		val iosArm64Test by getting {
//			configureSourceSet(this, "ios_arm64")
//
//			dependsOn(nativeTest)
//		}
//
//		val iosX64Main by getting {
//			configureSourceSet(this, "ios_x64")
//
//			dependsOn(nativeMain)
//		}
//		val iosX64Test by getting {
//			configureSourceSet(this, "ios_x64")
//
//			dependsOn(nativeTest)
//		}

		val jsMain by getting {
			configureSourceSet(this, "js")

			dependencies {
				implementation(kotlin("stdlib-js"))
			}
		}
		val jsTest by getting {
			configureSourceSet(this, "js")

			dependencies {
				implementation(kotlin("test-js"))
			}
		}

		val jvmMain by getting {
			configureSourceSet(this, "jvm")

			dependencies {
				implementation(kotlin("stdlib-jdk8"))
//				implementation(mapOf("name" to "JLink"))
			}
		}
		val jvmTest by getting {
			configureSourceSet(this, "jvm")

			dependencies {
				implementation(kotlin("test"))
				implementation(kotlin("test-junit"))
			}
		}

//		val linuxArm32HfpMain by getting {
//			configureSourceSet(this, "linux_arm32_hfp")
//
//			dependsOn(nativeMain)
//		}
//		val linuxArm32HfpTest by getting {
//			configureSourceSet(this, "linux_arm32_hfp")
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxMips32Main by getting {
//			configureSourceSet(this, "linux_mips32")
//
//			dependsOn(nativeMain)
//		}
//		val linuxMips32Test by getting {
//			configureSourceSet(this, "linux_mips32")
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxMipsel32Main by getting {
//			configureSourceSet(this, "linux_mipsel32")
//
//			dependsOn(nativeMain)
//		}
//		val linuxMipsel32Test by getting {
//			configureSourceSet(this, "linux_mipsel32")
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxX64Main by getting {
//			configureSourceSet(this, "linux_x64")
//
//			dependsOn(nativeMain)
//		}
//		val linuxX64Test by getting {
//			configureSourceSet(this, "linux_x64")
//
//			dependsOn(nativeTest)
//		}

		val macosX64Main by getting {
			configureSourceSet(this, "macos_x64")

			dependsOn(nativeMain)
		}
		val macosX64Test by getting {
			configureSourceSet(this, "macos_x64")

			dependsOn(nativeTest)
		}

//		val mingwX64Main by getting {
//			configureSourceSet(this, "mingw_x64")
//
//			dependsOn(nativeMain)
//		}
//		val mingwX64Test by getting {
//			configureSourceSet(this, "mingw_x64")
//
//			dependsOn(nativeTest)
//		}
//
//		val wasm32Main by getting {
//			configureSourceSet(this, "wasm32")
//
//			dependsOn(nativeMain)
//		}
//		val wasm32Test by getting {
//			configureSourceSet(this, "wasm32")
//
//			dependsOn(nativeTest)
//		}
	}
}

/**
 *
 */
fun configureSourceSet(sourceSet: KotlinSourceSet, packageName: String) {
	val compilation = if (sourceSet.name.endsWith("Main")) "main" else "test"
//	val name = sourceSet.name.replace(compilation.capitalize(), "")
	val srcDir = "src/$compilation/kotlin"
	val base = "$projectDir/$srcDir/com/daniloaraujosilva/mathemagika/library/$packageName"

	sourceSet.kotlin.setSrcDirs(listOf(base))

//	sourceSet.kotlin.setSrcDirs(listOf(srcDir))
//	sourceSet.kotlin.exclude {
//		val absolutePath = it.file.absolutePath
//
//		if (base.startsWith(absolutePath)) false else !absolutePath.startsWith(base)
//	}

	sourceSet.resources.setSrcDirs(listOf("src/$compilation/resources/$name"))
}

publishing {
	repositories {
		mavenLocal()
	}
}

val sourcesJar = task("sourcesJar", type = Jar::class) {
	archiveClassifier.set("sources")

	manifest {
		attributes["Implementation-Title"] = "Mathemagika Sources"
		attributes["Implementation-Version"] = archiveVersion
	}

	from(
		file("$projectDir/src/main/kotlin")
	)

	with(tasks.jar.get() as CopySpec)
}

//val javadocJar = task("javadocJar", type = Javadoc::class) {
//	// TODO Implement
//}

val shadowJar = tasks.withType<ShadowJar> {
	archiveClassifier.set("")

	// Assuming just one target.
	val target = kotlin.targets.iterator().next()
	from(target.compilations["main"].output)
	val runtimeClasspath = target.compilations["main"].compileDependencyFiles as Configuration
	configurations = mutableListOf(runtimeClasspath)

	dependencies {
//		include(dependency(":common"))
	}
}

publishing {
	publications {
//		create<MavenPublication>("library") {
////			group = "com.daniloaraujosilva"
////			artifactId = "mathemagika"
////
////			shadow.component(this)
//
//			from(components["kotlin"])
//			artifact(sourcesJar)
////			artifact(javadocJar)
//		}
		publications.withType<MavenPublication>().all {
			group = "com.daniloaraujosilva"

			artifactId = if (name != "kotlinMultiplatform") "mathemagika-$name" else "mathemagika"

			customizeForMavenCentral(pom)

//			signing.sign(this@all)
		}
	}
}

/**
 * Customize the POMs adding the content required by Maven Central
 */
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

tasks.named("bintrayUpload") {
	dependsOn("publishToMavenLocal")
}

/**
 *
 */
configure<BintrayExtension> {
	user = getProperty(listOf("bintray.user"))
	key = getProperty(listOf("bintray.key"))
	setPublications(*publishing.publications.names.toTypedArray())
	publish = true
	override = true
	pkg.apply {
		repo = "mathemagika"
		name = "mathemagika"
		desc = "Mathemagika is a Kotlin multiplatform library to communicate with Mathematica®. All over 6000+ bult-in Mathematica functions are supported out of the box."
		userOrg = "danilo-araujo-silva"
		websiteUrl = "https://github.com/Danilo-Araujo-Silva/mathemagika"
		vcsUrl = "https://github.com/Danilo-Araujo-Silva/mathemagika"
		issueTrackerUrl = "https://github.com/Danilo-Araujo-Silva/mathemagika/issues"
		setLicenses("Apache-2.0")
		setLabels("Mathemagika", "Mathematica", "Kotlin", "Multiplatform")
		version.apply {
			name = project.version.toString()
			desc = project.version.toString()
			released = Date().toString()
		}
	}
}
