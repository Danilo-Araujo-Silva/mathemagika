package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotRightTriangleEqual
 *
 * Full name:        System`NotRightTriangleEqual
 *
 * Usage:            NotRightTriangleEqual[x, y, …] displays as x ⋭ y ⋭ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotRightTriangleEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotRightTriangleEqual.html
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
fun notRightTriangleEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotRightTriangleEqual", arguments.toMutableList(), options)
}
