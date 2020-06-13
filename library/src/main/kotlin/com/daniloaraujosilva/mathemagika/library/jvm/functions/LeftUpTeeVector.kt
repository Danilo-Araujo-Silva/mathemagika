package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LeftUpTeeVector
 *
 * Full name:        System`LeftUpTeeVector
 *
 * Usage:            LeftUpTeeVector[x, y, …] displays as x ⥠ y ⥠ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftUpTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftUpTeeVector.html
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
fun leftUpTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftUpTeeVector", arguments.toMutableList(), options)
}
