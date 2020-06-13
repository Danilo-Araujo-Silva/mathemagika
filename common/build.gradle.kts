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
	val base = "$projectDir/$srcDir/com/daniloaraujosilva/mathemagika/common/$packageName"

	sourceSet.kotlin.setSrcDirs(listOf(base))

//	sourceSet.kotlin.setSrcDirs(listOf(srcDir))
//	sourceSet.kotlin.exclude {
//		val absolutePath = it.file.absolutePath
//
//		if (base.startsWith(absolutePath)) false else !absolutePath.startsWith(base)
//	}

	sourceSet.resources.setSrcDirs(listOf("src/$compilation/resources/$name"))
}
