plugins {
	kotlin("multiplatform")
}

kotlin {
	androidNativeArm32 {
	}

	androidNativeArm64 {
	}

	iosArm32 {
		binaries {
			framework {}
		}
	}

	iosArm64 {
		binaries {
			framework {}
		}
	}

	iosX64 {
		binaries {
			framework {}
		}
	}

	js {
		browser {
		}

		nodejs {
		}
	}

	jvm {
	}

	linuxArm32Hfp {
	}

	linuxMips32 {
	}

	linuxMipsel32 {
	}

	linuxX64 {
	}

	macosX64 {
	}

	mingwX64 {
	}

	wasm32 {
	}

	jvm {
	}

	sourceSets {
		val commonMain by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "common")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "common")))

			dependencies {
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

		val nativeMain by creating {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "native")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "native")))

			dependsOn(commonMain)
		}
		val nativeTest by creating {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "native")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "native")))

			dependsOn(commonTest)
		}

		val androidNativeArm32Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "android_native_arm32")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "android_native_arm32")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val androidNativeArm32Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "android_native_arm32")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "android_native_arm32")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val androidNativeArm64Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "android_native_arm64")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "android_native_arm64")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val androidNativeArm64Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "android_native_arm64")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "android_native_arm64")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}
		
		val iosArm32Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "ios_arm32")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "ios_arm32")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val iosArm32Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "ios_arm32")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "ios_arm32")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val iosArm64Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "ios_arm64")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "ios_arm64")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val iosArm64Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "ios_arm64")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "ios_arm64")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val iosX64Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "ios_x64")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "ios_x64")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val iosX64Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "ios_x64")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "ios_x64")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}
		
		val jsMain by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "js")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "js")))

			dependsOn(commonMain)
			dependsOn(nativeMain)

			dependencies {
				implementation(kotlin("stdlib-js"))
			}
		}
		val jsTest by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "js")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "js")))

			dependsOn(commonTest)

			dependencies {
				implementation(kotlin("test-js"))
			}
		}
		
		val jvmMain by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "jvm")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "jvm")))

			dependsOn(commonMain)
			dependsOn(nativeMain)

			dependencies {
				implementation(kotlin("stdlib-jdk8"))
			}
		}
		val jvmTest by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "jvm")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "jvm")))

			dependsOn(commonTest)

			dependencies {
				implementation(kotlin("test"))
				implementation(kotlin("test-junit"))
			}
		}
		
		val linuxArm32HfpMain by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_arm32_hfp")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_arm32_hfp")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val linuxArm32HfpTest by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_arm32_hfp")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_arm32_hfp")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}
		
		val linuxMips32Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_mips32")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_mips32")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val linuxMips32Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_mips32")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_mips32")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val linuxMipsel32Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_mipsel32")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_mipsel32")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val linuxMipsel32Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_mipsel32")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_mipsel32")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val linuxX64Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "linux_x64")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "linux_x64")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val linuxX64Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "linux_x64")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "linux_x64")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val macosX64Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "macos_x64")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "macos_x64")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val macosX64Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "macos_x64")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "macos_x64")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val mingwX64Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "mingw_x64")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "mingw_x64")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val mingwX64Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "mingw_x64")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "mingw_x64")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}

		val wasm32Main by getting {
			kotlin.setSrcDirs(listOf(getPath("main", "kotlin", "wasm32")))
			resources.setSrcDirs(listOf(getPath("main", "resources", "wasm32")))

			dependsOn(commonMain)
			dependsOn(nativeMain)
		}
		val wasm32Test by getting {
			kotlin.setSrcDirs(listOf(getPath("test", "kotlin", "wasm32")))
			resources.setSrcDirs(listOf(getPath("test", "resources", "wasm32")))

			dependsOn(commonTest)
			dependsOn(nativeTest)
		}
	}
}

/**
 *
 */
fun getPath(compilation: String, type: String, name: String): String {
	return if (type == "kotlin")
		"src/$compilation/$type/com/daniloaraujosilva/mathemagika/common/$name/common"
	else
		"src/$compilation/$type/$name"
}
