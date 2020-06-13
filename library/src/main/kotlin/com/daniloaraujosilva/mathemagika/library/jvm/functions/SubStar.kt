package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SubStar
 *
 * Full name:        System`SubStar
 *
 *                   SubStar[expr] displays as expr .
 * Usage:                                          *
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SubStar
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubStar.html
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
fun subStar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubStar", arguments.toMutableList(), options)
}
