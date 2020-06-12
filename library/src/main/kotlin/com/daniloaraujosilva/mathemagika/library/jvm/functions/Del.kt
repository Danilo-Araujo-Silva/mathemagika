package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Del
 *
 * Full name:        System`Del
 *
 * Usage:            Del[x] displays as ∇ x.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Del
 * Documentation:    web: http://reference.wolfram.com/language/ref/Del.html
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
fun del(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Del", arguments.toMutableList(), options)
}
