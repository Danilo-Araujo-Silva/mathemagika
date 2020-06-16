package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Verbatim
 *
 * Full name:        System`Verbatim
 *
 * Usage:            Verbatim[expr] represents expr in pattern matching, requiring that expr be matched exactly as it appears, with no substitutions for blanks or other transformations.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Verbatim
 * Documentation:    web: http://reference.wolfram.com/language/ref/Verbatim.html
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
fun verbatim(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Verbatim", arguments.toMutableList(), options)
}
