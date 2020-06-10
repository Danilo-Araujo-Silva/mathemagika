package com.daniloaraujosilva.mathemagika.common.jvm.common

import kotlin.reflect.KClass

/**
 * TODO Remove this method when Kotlin 1.4 becomes stable.
 */
fun KClass<Any>.isSuperclassOf(input: Any): Boolean {
	@Suppress("UNCHECKED_CAST")
	return (input as KClass<Any>).java.isAssignableFrom(this.java)
}
