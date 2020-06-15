import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
	kotlin("jvm") version "1.4-M2"
}

buildscript {
	repositories {
		jcenter()
	}
	dependencies {
		classpath("com.github.jengelman.gradle.plugins:shadow:5.2.0")
	}
}

apply(plugin = "com.github.johnrengelman.shadow")
apply(plugin = "java")

dependencies {
	implementation(kotlin("stdlib-jdk8"))

//	implementation("com.daniloaraujosilva:mathemagika:0.0.1")

	implementation("com.daniloaraujosilva.mathemagika:library-jvm:0.0.1")

//	implementation(mapOf("name" to "JLink"))

	testImplementation(kotlin("test"))
	testImplementation(kotlin("test-junit"))
}

repositories {
	mavenLocal()
	mavenCentral()
	jcenter()
	maven( url = "https://dl.bintray.com/kotlin/kotlin-eap" )
//	flatDir { dirs(System.getenv("JLINK_HOME")) }
}

tasks.withType<ShadowJar> {
	manifest {
		attributes["Main-Class"] = "com.daniloaraujosilva.mathemagika.application.playground.MainKt"
	}
}
