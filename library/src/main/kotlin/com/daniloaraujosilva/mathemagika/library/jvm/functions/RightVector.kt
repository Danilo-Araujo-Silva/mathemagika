package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RightVector
 *
 * Full name:        System`RightVector
 *
 * Usage:            RightVector[x, y, …] displays as x ⇀ y ⇀ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightVector.html
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
fun rightVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightVector", arguments.toMutableList(), options)
}
