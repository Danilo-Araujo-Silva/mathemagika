package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightUpDownVector
 *
 * Full name:        System`RightUpDownVector
 *
 * Usage:            RightUpDownVector[x, y, …] displays as x ⥏ y ⥏ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightUpDownVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightUpDownVector.html
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
fun rightUpDownVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightUpDownVector", arguments.toMutableList(), options)
}
