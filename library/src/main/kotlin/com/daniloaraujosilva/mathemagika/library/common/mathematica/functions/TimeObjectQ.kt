package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TimeObjectQ
 *
 * Full name:        System`TimeObjectQ
 *
 * Usage:            TimeObjectQ[expr] gives True if expr is a TimeObject with valid arguments, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeObjectQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeObjectQ.html
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
fun timeObjectQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeObjectQ", arguments.toMutableList(), options)
}
