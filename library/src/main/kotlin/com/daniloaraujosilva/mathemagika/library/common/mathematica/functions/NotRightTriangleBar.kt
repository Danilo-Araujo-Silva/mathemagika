package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotRightTriangleBar
 *
 * Full name:        System`NotRightTriangleBar
 *
 * Usage:            NotRightTriangleBar[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotRightTriangleBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotRightTriangleBar.html
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
fun notRightTriangleBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotRightTriangleBar", arguments.toMutableList(), options)
}
