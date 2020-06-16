package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RightDownVector
 *
 * Full name:        System`RightDownVector
 *
 * Usage:            RightDownVector[x, y, …] displays as x ⇂ y ⇂ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightDownVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightDownVector.html
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
fun rightDownVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightDownVector", arguments.toMutableList(), options)
}
