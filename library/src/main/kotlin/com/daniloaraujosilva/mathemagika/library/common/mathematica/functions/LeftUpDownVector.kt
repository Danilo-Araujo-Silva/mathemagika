package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftUpDownVector
 *
 * Full name:        System`LeftUpDownVector
 *
 * Usage:            LeftUpDownVector[x, y, …] displays as x ⥑ y ⥑ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftUpDownVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftUpDownVector.html
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
fun leftUpDownVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftUpDownVector", arguments.toMutableList(), options)
}
