package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Hash
 *
 * Full name:        System`Hash
 *
 *                   Hash[expr] gives an integer hash code for the expression expr.
 *                   Hash[expr, "type"] gives an integer hash code of the specified type for expr.
 * Usage:            Hash[expr, "type", "format"] gives a hash code in the specified format.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Hash
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hash.html
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
fun hash(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hash", arguments.toMutableList(), options)
}
