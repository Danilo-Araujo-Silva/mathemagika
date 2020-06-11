package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $Pre
 *
 * Full name:        System`$Pre
 *
 * Usage:            $Pre is a global variable whose value, if set, is applied to every input expression.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/$Pre
 * Documentation:    web: http://reference.wolfram.com/language/ref/$Pre.html
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
fun `$Pre`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$Pre", arguments.toMutableList(), options)
}
