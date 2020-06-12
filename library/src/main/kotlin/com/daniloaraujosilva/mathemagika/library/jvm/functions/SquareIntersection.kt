package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareIntersection
 *
 * Full name:        System`SquareIntersection
 *
 * Usage:            SquareIntersection[x, y, …] displays as x ⊓ y ⊓ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SquareIntersection
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareIntersection.html
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
fun squareIntersection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareIntersection", arguments.toMutableList(), options)
}
