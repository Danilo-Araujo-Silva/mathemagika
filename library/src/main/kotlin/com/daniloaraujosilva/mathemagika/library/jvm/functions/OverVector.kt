package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OverVector
 *
 * Full name:        System`OverVector
 *
 * Usage:            OverVector[expr] displays with a right vector over expr.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/OverVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverVector.html
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
fun overVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverVector", arguments.toMutableList(), options)
}
