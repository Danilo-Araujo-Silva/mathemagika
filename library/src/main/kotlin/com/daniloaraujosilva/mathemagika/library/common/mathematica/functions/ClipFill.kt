package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ClipFill
 *
 * Full name:        System`ClipFill
 *
 * Usage:            ClipFill is an option for plotting functions that specifies what should be shown where curves or surfaces would extend beyond the plot range.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClipFill
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClipFill.html
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
fun clipFill(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClipFill", arguments.toMutableList(), options)
}
