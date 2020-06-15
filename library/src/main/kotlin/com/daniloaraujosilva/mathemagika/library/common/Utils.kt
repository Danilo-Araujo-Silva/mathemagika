package com.daniloaraujosilva.mathemagika.library.common

import com.daniloaraujosilva.mathemagika.library.common.system.getProperty
import kotlin.reflect.KClass

/**
 *
 */
@Suppress("UNCHECKED_CAST")
inline fun <reified Type> kotlinClass(): KClass<Any> = (Type::class as KClass<Any>)

/**
 *
 */
fun detectOperatingSystem(): OperatingSystem {
	// TODO Verify if this is multiplatform compatible.
	val os = getProperty(listOf("os.name"), "generic")?.toLowerCase()

	return when {
		os == null -> OperatingSystem.OTHER
		os.contains("mac") || os.contains("darwin") -> OperatingSystem.MAC_OS_X
		os.contains("win") -> OperatingSystem.WINDOWS
		os.contains("nux") -> OperatingSystem.LINUX
		else -> {
			OperatingSystem.OTHER
		}
	}
}
