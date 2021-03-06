import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
	kotlin("jvm")
	id("com.github.johnrengelman.shadow")
	id("java")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	implementation(project(":library"))

	testImplementation(kotlin("test"))
	testImplementation(kotlin("test-junit"))
}

repositories {
	mavenCentral()
	mavenLocal()
	maven( url = "https://dl.bintray.com/kotlin/kotlin-eap" )
	flatDir { dirs(
		"/Applications/Mathematica.app/Contents/SystemFiles/Links/JLink"
	) }
}

tasks.withType<ShadowJar> {
	manifest {
		attributes.put("Main-Class", "com.daniloaraujosilva.mathemagika.application.playground.MainKt")
	}
}
