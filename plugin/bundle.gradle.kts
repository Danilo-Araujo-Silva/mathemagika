/**
 * TODO Because of Gradle limitation, it was needed to put all code in just one file, since we cannot, for now,
 * 	import one plugin file into another or use a class / variable defined in another file.
 */

// Properties imports
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Properties as JavaProperties

// Dependencies imports

// Initialize imports
import java.io.File.separator

/**
 * TODO Change this implemenation to do not use kotlin objects. When gradle daemon runs, the same properties are kept
 * 	alive for a long time, creating hidden errors.
 */
object Properties {

	/**
	 *
	 */
	object modules {

		/**
		 *
		 */
		object root {

			/**
			 *
			 */
			lateinit var file: File

			/**
			 *
			 */
			val path: Path by lazy {
				file.absoluteFile.toPath()
			}

			/**
			 *
			 */
			val absolutePath: String by lazy {
				file.absolutePath
			}

			/**
			 *
			 */
			val group: String by lazy {
				get("group")
			}

			/**
			 *
			 */
			val artifact: String by lazy {
				get("artifact")
			}

			/**
			 *
			 */
			val version: String by lazy {
				get("version")
			}
		}
	}

	/**
	 *
	 */
	val local: JavaProperties by lazy {
		loadProperties(JavaProperties(), Paths.get(modules.root.absolutePath, "local.properties").toFile())
	}

	/**
	 *
	 */
	val environment by lazy {
		System.getenv()
	}

	/**
	 *
	 */
	val system: JavaProperties = JavaProperties()

	/**
	 *
	 */
	val gradle: JavaProperties by lazy {
		loadProperties(JavaProperties(), Paths.get(modules.root.absolutePath, "gradle.properties").toFile())
	}

	/**
	 *
	 */
	val globalGradle: JavaProperties by lazy {
		loadProperties(JavaProperties(), Paths.get(System.getProperty("user.home"), ".gradle", "gradle.properties").toFile())
	}

	/**
	 *
	 */
	fun containsKey(vararg keys: String): Boolean {
		if (keys.isNullOrEmpty()) return false

		keys.forEach {
			when {
				local.containsKey(it) -> return true
				environment.containsKey(it) -> return true
				system.containsKey(it) -> return true
				gradle.containsKey(it) -> return true
				globalGradle.containsKey(it) -> return true
			}
		}

		return false
	}

	/**
	 *
	 */
	fun get(vararg keys: String): String {
		return get(keys.toList())
	}

	/**
	 *
	 */
	fun get(keys: List<String>): String {
		return this.getAndCast<String>(keys) ?: throw IllegalArgumentException("Property key(s) ${keys} not found.")
	}

	/**
	 *
	 */
	fun getOrNull(vararg keys: String): String? {
		return getOrNull(keys.toList())
	}

	/**
	 *
	 */
	fun getOrNull(keys: List<String>): String? {
		return getAndCast<String>(keys)
	}

	/**
	 *
	 */
	inline fun <reified R> getOrDefault(vararg keys: String, default: R): R {
		return getAndCast<R>(*keys) ?: default
	}

	/**
	 *
	 */
	inline fun <reified R> getOrDefault(keys: List<String>, default: R): R {
		return getAndCast<R>(keys) ?: default
	}

	/**
	 *
	 */
	inline fun <reified R> getAndCast(vararg keys: String): R? {
		return getAndCast(keys.toList())
	}

	/**
	 *
	 */
	inline fun <reified R> getAndCast(keys: List<String>): R? {
		if (keys.isNullOrEmpty()) return null

		keys.forEach {
			val value = when {
				local.containsKey(it) -> local[it]
				environment.containsKey(it) -> environment[it]
				system.containsKey(it) -> system[it]
				gradle.containsKey(it) -> gradle[it]
				globalGradle.containsKey(it) -> globalGradle[it]
				else -> null
			}

			// TODO Improve the casting using Jackson
			if (value != null) return value as R
		}

		return null
	}

	/**
	 *
	 */
	private fun loadProperties(target: JavaProperties, file: File): JavaProperties {
		if (file.canRead()) {
			file.inputStream().use { target.load(it) }
		}

		return target
	}
}

if (rootProject.name == "buildSrc") {
	Properties.modules.root.file = rootDir.parentFile
} else {
	Properties.modules.root.file = rootDir
}

// TODO Export more methods
extra["getProperty"] = { keys: List<String> -> Properties.get(keys) }
extra["getPropertyOrNull"] = { keys: List<String> -> Properties.getOrNull(keys) }
extra["getPropertyOrDefault"] = { keys: List<String>, default: String -> Properties.getOrDefault(keys, default) }

//======================================================================================================================

/**
 *
 */
data class Dependency(
	val group: String,
	val artifact: String,
	val version: String
)

/**
 *
 */
object Dependencies {

	/**
	 *
	 */
	private val dependencies: MutableMap<String, MutableMap<String, Dependency>> = mutableMapOf()

	fun add(rawDependency: String, rawModules: Set<String>) {
		val rawDependencySplit = rawDependency.split(":")
		val dependencyGroup = rawDependencySplit[0]
		val dependencyArtifact = rawDependencySplit[1]
		val dependencyVersion = rawDependencySplit[2]

		rawModules.map {
			val group = it.trim()

			if (!dependencies.containsKey(group)) dependencies[group] = mutableMapOf()

			dependencies[group]!!["${dependencyGroup}:${dependencyArtifact}"] = Dependency(dependencyGroup, dependencyArtifact, dependencyVersion)
		}
	}

	/**
	 * TODO Integrate validation from the methods getDependency and getVersion in one method.
	 */
	fun getDependency(group: String, dependencyId: String): String {
		if (!dependencies.containsKey(group)) throw Exception("""Module "${group}" not found in the dependencies.""")
		if (!dependencies[group]!!.containsKey(dependencyId)) throw Exception("""Dependency "${dependencyId}" not found in the module "${group}".""")

		return "$dependencyId:${dependencies[group]!![dependencyId]!!.version}"
	}

	/**
	 * TODO Integrate validation from the methods getDependency and getVersion in one method.
	 */
	fun getVersion(group: String, dependencyId: String): String {
		if (!dependencies.containsKey(group)) throw Exception("""Module "${group}" not found in the dependencies.""")
		if (!dependencies[group]!!.containsKey(dependencyId)) throw Exception("""Dependency "${dependencyId}" not found in the module "${group}".""")

		return dependencies[group]!![dependencyId]!!.version
	}
}

extra["getDependency"] = { group: String, dependencyId: String -> Dependencies.getDependency(group, dependencyId) }
extra["getDependencyVersion"] = { group: String, dependencyId: String -> Dependencies.getVersion(group, dependencyId) }

// TODO Find a workaround to do not hardcode this.
val kotlinVersion = Properties.get("kotlin.version")

Dependencies.add("com.github.salomonbrys.gradle.kotlin.js:kotlin-js-gradle-utils:1.2.0", setOf("settings.gradle.kts"))
Dependencies.add("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion", setOf("settings.gradle.kts", "buildSrc/build.gradle.kts"))

Dependencies.add("junit:junit:4.12", setOf("buildSrc/build.gradle.kts"))
Dependencies.add("com.fasterxml.jackson.core:jackson-databind:2.10.1", setOf("buildSrc/build.gradle.kts"))
Dependencies.add("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.8", setOf("buildSrc/build.gradle.kts"))
Dependencies.add("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.9.8", setOf("buildSrc/build.gradle.kts"))

Dependencies.add("com.github.jengelman.gradle.plugins:shadow:5.0.0", setOf("build.gradle.kts"))
Dependencies.add("org.jetbrains.dokka:dokka-gradle-plugin:0.10.1", setOf("build.gradle.kts"))
