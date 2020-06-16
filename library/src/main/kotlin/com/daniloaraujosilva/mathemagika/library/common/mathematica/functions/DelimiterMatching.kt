package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DelimiterMatching
 *
 * Full name:        System`DelimiterMatching
 *
 * Usage:            DelimiterMatching is an option for selections that specifies whether an opening delimiter will match only its respective closing delimiter or any closing delimiter.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DelimiterMatching
 * Documentation:    web: http://reference.wolfram.com/language/ref/DelimiterMatching.html
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
fun delimiterMatching(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DelimiterMatching", arguments.toMutableList(), options)
}
