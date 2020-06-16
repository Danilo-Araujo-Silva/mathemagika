package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DownLeftRightVector
 *
 * Full name:        System`DownLeftRightVector
 *
 * Usage:            DownLeftRightVector[x, y, …] displays as x ⥐ y ⥐ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownLeftRightVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownLeftRightVector.html
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
fun downLeftRightVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownLeftRightVector", arguments.toMutableList(), options)
}
