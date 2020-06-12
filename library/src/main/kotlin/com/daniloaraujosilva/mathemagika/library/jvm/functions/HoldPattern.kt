package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HoldPattern
 *
 * Full name:        System`HoldPattern
 *
 * Usage:            HoldPattern[expr] is equivalent to expr for pattern matching, but maintains expr in an unevaluated form.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HoldPattern
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoldPattern.html
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
fun holdPattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoldPattern", arguments.toMutableList(), options)
}
