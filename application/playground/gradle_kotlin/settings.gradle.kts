rootProject.name = "playground_gradle_kotlin"

enableFeaturePreview("GRADLE_METADATA")

pluginManagement {
	repositories {
		mavenLocal()
		mavenCentral()
		jcenter()
		maven( url = "https://dl.bintray.com/kotlin/kotlin-eap" )
	}
}
