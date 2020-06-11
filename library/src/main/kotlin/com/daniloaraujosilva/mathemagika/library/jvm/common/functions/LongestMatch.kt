package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LongestMatch
 *
 * Full name:        System`LongestMatch
 *
 * Usage:            LongestMatch[p] is a string pattern object matching the longest sequence of characters consistent with the string pattern p.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LongestMatch
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongestMatch.html
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
fun longestMatch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongestMatch", arguments.toMutableList(), options)
}
