package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ClearSystemCache
 *
 * Full name:        System`ClearSystemCache
 *
 *                   ClearSystemCache[] clears internal system caches of stored results.
 * Usage:            ClearSystemCache[type] clears only caches of the specified type.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClearSystemCache
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClearSystemCache.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun clearSystemCache(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClearSystemCache", arguments.toMutableList(), options)
}
