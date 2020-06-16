package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AppendTo
 *
 * Full name:        System`AppendTo
 *
 * Usage:            AppendTo[s, elem] appends elem to the value of s, and resets s to the result.
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AppendTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/AppendTo.html
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
fun appendTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AppendTo", arguments.toMutableList(), options)
}
