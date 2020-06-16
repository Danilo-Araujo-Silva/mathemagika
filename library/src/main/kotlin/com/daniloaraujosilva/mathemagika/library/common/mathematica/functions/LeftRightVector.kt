package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftRightVector
 *
 * Full name:        System`LeftRightVector
 *
 * Usage:            LeftRightVector[x, y, …] displays as x ⥎ y ⥎ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftRightVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftRightVector.html
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
fun leftRightVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftRightVector", arguments.toMutableList(), options)
}
