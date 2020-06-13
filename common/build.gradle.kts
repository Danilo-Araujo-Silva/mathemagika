import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

plugins {
	kotlin("multiplatform")
	id("maven-publish")
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
			configureSourceSet(this)

			dependencies {
				implementation(kotlin("stdlib-common"))
			}
		}

		val commonTest by getting {
			configureSourceSet(this)

			dependencies {
				implementation(kotlin("test-common"))
				implementation(kotlin("test-annotations-common"))
			}
		}

		val nativeMain by creating {
			configureSourceSet(this)

			dependsOn(commonMain)
		}
		val nativeTest by creating {
			configureSourceSet(this)

			dependsOn(commonTest)
		}

//		val androidNativeArm32Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val androidNativeArm32Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val androidNativeArm64Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val androidNativeArm64Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val iosArm32Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val iosArm32Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val iosArm64Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val iosArm64Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val iosX64Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val iosX64Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}

		val jsMain by getting {
			configureSourceSet(this)

			dependencies {
				implementation(kotlin("stdlib-js"))
			}
		}
		val jsTest by getting {
			configureSourceSet(this)

			dependencies {
				implementation(kotlin("test-js"))
			}
		}

		val jvmMain by getting {
			configureSourceSet(this)

			dependencies {
				implementation(kotlin("stdlib-jdk8"))
			}
		}
		val jvmTest by getting {
			configureSourceSet(this)

			dependencies {
				implementation(kotlin("test"))
				implementation(kotlin("test-junit"))
			}
		}

//		val linuxArm32HfpMain by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val linuxArm32HfpTest by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxMips32Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val linuxMips32Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxMipsel32Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val linuxMipsel32Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val linuxX64Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val linuxX64Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}

		val macosX64Main by getting {
			configureSourceSet(this)

			dependsOn(nativeMain)
		}
		val macosX64Test by getting {
			configureSourceSet(this)

			dependsOn(nativeTest)
		}

//		val mingwX64Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val mingwX64Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
//
//		val wasm32Main by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeMain)
//		}
//		val wasm32Test by getting {
//			configureSourceSet(this)
//
//			dependsOn(nativeTest)
//		}
	}
}

/**
 *
 */
fun configureSourceSet(sourceSet: KotlinSourceSet) {
	val compilation = if (sourceSet.name.endsWith("Main")) "main" else "test"
	val name = sourceSet.name.replace(compilation.capitalize(), "")
	val srcDir = "src/$compilation/kotlin"
	val base = "$projectDir/$srcDir/com/daniloaraujosilva/mathemagika/common/$name"

	sourceSet.kotlin.setSrcDirs(listOf(srcDir))
	sourceSet.kotlin.exclude {
		val absolutePath = it.file.absolutePath

		if (base.startsWith(absolutePath)) false else !absolutePath.startsWith(base)
	}

	sourceSet.resources.setSrcDirs(listOf("src/$compilation/resources/$name"))
}
