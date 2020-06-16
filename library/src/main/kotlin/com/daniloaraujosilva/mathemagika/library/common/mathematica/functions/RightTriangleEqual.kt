package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RightTriangleEqual
 *
 * Full name:        System`RightTriangleEqual
 *
 * Usage:            RightTriangleEqual[x, y, …] displays as x ⊵ y ⊵ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightTriangleEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightTriangleEqual.html
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
fun rightTriangleEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightTriangleEqual", arguments.toMutableList(), options)
}
