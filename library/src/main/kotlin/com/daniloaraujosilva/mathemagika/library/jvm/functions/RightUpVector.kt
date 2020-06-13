package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RightUpVector
 *
 * Full name:        System`RightUpVector
 *
 * Usage:            RightUpVector[x, y, …] displays as x ↾ y ↾ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightUpVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightUpVector.html
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
fun rightUpVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightUpVector", arguments.toMutableList(), options)
}
