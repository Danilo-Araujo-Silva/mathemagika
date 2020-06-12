package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightTeeVector
 *
 * Full name:        System`RightTeeVector
 *
 * Usage:            RightTeeVector[x, y, …] displays as x ⥛ y ⥛ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightTeeVector.html
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
fun rightTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightTeeVector", arguments.toMutableList(), options)
}
