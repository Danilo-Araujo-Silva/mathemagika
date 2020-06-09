import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
	kotlin("multiplatform")

	id("com.github.johnrengelman.shadow")
	id("java")
}

kotlin {
	jvm {
	}

	sourceSets {
		val jvmMain by getting {
			dependencies {
				implementation(kotlin("stdlib-jdk8"))
			}
		}

		val jvmTest by getting {
			dependencies {
				implementation(kotlin("test"))
				implementation(kotlin("test-junit"))
			}
		}
	}
}

tasks.withType<ShadowJar> {
	manifest {
		attributes.put("Main-Class", "com.daniloraraujosilva.mathemagika.application.ExampleKt")
	}

	val compilation = "main"
	val target = kotlin.targets.iterator().next()
	from(target.compilations[compilation].output)
	val runtimeClasspath = target.compilations[compilation].compileDependencyFiles as Configuration
	configurations = mutableListOf(runtimeClasspath)
}
