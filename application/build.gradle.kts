import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
	kotlin("jvm")
	id("com.github.johnrengelman.shadow")
	id("java")
}

dependencies {
	implementation(project(":common"))
	implementation(project(":library"))

	implementation(kotlin("stdlib-jdk8"))

	testImplementation(kotlin("test"))
	testImplementation(kotlin("test-junit"))
}

tasks.withType<ShadowJar> {
	manifest {
		attributes.put("Main-Class", "com.daniloaraujosilva.mathemagika.application.ExampleKt")
	}
}
