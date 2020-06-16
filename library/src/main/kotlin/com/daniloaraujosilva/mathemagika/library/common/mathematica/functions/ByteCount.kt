package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ByteCount
 *
 * Full name:        System`ByteCount
 *
 * Usage:            ByteCount[expr] gives the number of bytes used internally by the Wolfram System to store expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ByteCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/ByteCount.html
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
fun byteCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ByteCount", arguments.toMutableList(), options)
}
