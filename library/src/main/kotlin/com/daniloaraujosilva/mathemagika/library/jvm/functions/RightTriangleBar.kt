package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RightTriangleBar
 *
 * Full name:        System`RightTriangleBar
 *
 * Usage:            RightTriangleBar[x, y, …] displays as x ⧐ y ⧐ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightTriangleBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightTriangleBar.html
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
fun rightTriangleBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightTriangleBar", arguments.toMutableList(), options)
}
