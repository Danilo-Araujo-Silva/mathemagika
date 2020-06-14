package com.daniloaraujosilva.mathemagika.library.common

/**
 *
 */
fun <A, B> Map<A, B>.merge(vararg maps: Map<A, B>): Map<A, B> {
	val mutableMap = this.toMutableMap()

	maps.toList().forEach { mutableMap.putAll(it) }

	return mutableMap
}
