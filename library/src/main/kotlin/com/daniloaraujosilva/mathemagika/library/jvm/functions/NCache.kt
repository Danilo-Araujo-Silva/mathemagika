package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NCache
 *
 * Full name:        System`NCache
 *
 * Usage:            NCache[x, xn] represents a numeric cache object for a quantity with exact value x and approximate numerical value xn.
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NCache
 * Documentation:    web: http://reference.wolfram.com/language/ref/NCache.html
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
fun nCache(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NCache", arguments.toMutableList(), options)
}
