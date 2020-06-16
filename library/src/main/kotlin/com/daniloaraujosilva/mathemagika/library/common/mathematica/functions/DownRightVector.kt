package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DownRightVector
 *
 * Full name:        System`DownRightVector
 *
 * Usage:            DownRightVector[x, y, …] displays as x ⇁ y ⇁ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownRightVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownRightVector.html
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
fun downRightVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownRightVector", arguments.toMutableList(), options)
}
