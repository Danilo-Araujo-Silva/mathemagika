package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftUpVector
 *
 * Full name:        System`LeftUpVector
 *
 * Usage:            LeftUpVector[x, y, …] displays as x ↿ y ↿ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftUpVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftUpVector.html
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
fun leftUpVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftUpVector", arguments.toMutableList(), options)
}
