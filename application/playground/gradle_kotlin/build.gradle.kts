//import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
	kotlin("jvm") version "1.4-M2"
//	id("com.github.johnrengelman.shadow") version "5.0.0"
//	id("java")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))

	implementation("com.daniloaraujosilva:mathemagika:0.0.1")

	implementation(mapOf("name" to "JLink"))

	testImplementation(kotlin("test"))
	testImplementation(kotlin("test-junit"))
}

repositories {
	mavenLocal()
	mavenCentral()
	jcenter()
	maven( url = "https://dl.bintray.com/kotlin/kotlin-eap" )
	flatDir { dirs(System.getenv("JLINK_HOME")) }
}

//tasks.withType<ShadowJar> {
//	manifest {
//		attributes.put("Main-Class", "com.daniloaraujosilva.mathemagika.application.playground.MainKt")
//	}
//}
