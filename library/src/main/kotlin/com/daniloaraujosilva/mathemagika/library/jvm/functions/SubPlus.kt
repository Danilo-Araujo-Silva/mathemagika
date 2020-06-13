package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SubPlus
 *
 * Full name:        System`SubPlus
 *
 *                   SubPlus[expr] displays as expr .
 * Usage:                                          +
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SubPlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubPlus.html
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
fun subPlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubPlus", arguments.toMutableList(), options)
}
