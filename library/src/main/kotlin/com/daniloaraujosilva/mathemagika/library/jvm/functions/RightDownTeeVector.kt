package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightDownTeeVector
 *
 * Full name:        System`RightDownTeeVector
 *
 * Usage:            RightDownTeeVector[x, y, …] displays as x ⥝ y ⥝ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightDownTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightDownTeeVector.html
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
fun rightDownTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightDownTeeVector", arguments.toMutableList(), options)
}
