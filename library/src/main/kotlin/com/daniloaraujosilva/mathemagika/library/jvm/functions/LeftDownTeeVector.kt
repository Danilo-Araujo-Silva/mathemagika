package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LeftDownTeeVector
 *
 * Full name:        System`LeftDownTeeVector
 *
 * Usage:            LeftDownTeeVector[x, y, …] displays as x ⥡ y ⥡ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftDownTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftDownTeeVector.html
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
fun leftDownTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftDownTeeVector", arguments.toMutableList(), options)
}
