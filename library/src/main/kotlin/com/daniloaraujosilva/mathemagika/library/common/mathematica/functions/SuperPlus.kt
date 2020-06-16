package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SuperPlus
 *
 * Full name:        System`SuperPlus
 *
 *                                                   +
 * Usage:            SuperPlus[expr] displays as expr .
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SuperPlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuperPlus.html
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
fun superPlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuperPlus", arguments.toMutableList(), options)
}
