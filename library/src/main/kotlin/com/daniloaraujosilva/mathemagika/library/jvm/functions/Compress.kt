package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Compress
 *
 * Full name:        System`Compress
 *
 * Usage:            Compress[expr] gives a compressed representation of expr as a string.
 *
 * Options:          Method -> {}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Compress
 * Documentation:    web: http://reference.wolfram.com/language/ref/Compress.html
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
fun compress(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Compress", arguments.toMutableList(), options)
}
