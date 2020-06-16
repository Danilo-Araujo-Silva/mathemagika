package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RightUpTeeVector
 *
 * Full name:        System`RightUpTeeVector
 *
 * Usage:            RightUpTeeVector[x, y, …] displays as x ⥜ y ⥜ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightUpTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightUpTeeVector.html
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
fun rightUpTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightUpTeeVector", arguments.toMutableList(), options)
}
