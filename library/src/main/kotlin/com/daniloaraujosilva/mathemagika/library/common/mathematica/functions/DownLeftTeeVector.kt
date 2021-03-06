package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DownLeftTeeVector
 *
 * Full name:        System`DownLeftTeeVector
 *
 * Usage:            DownLeftTeeVector[x, y, …] displays as x ⥞ y ⥞ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownLeftTeeVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownLeftTeeVector.html
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
fun downLeftTeeVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownLeftTeeVector", arguments.toMutableList(), options)
}
