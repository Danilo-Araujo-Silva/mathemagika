package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShortestMatch
 *
 * Full name:        System`ShortestMatch
 *
 * Usage:            ShortestMatch[p] is a string pattern object matching the shortest sequence of characters consistent with the string pattern p.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShortestMatch
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShortestMatch.html
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
fun shortestMatch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShortestMatch", arguments.toMutableList(), options)
}
