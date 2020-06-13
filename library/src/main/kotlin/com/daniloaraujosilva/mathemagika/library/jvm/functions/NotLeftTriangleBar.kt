package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotLeftTriangleBar
 *
 * Full name:        System`NotLeftTriangleBar
 *
 * Usage:            NotLeftTriangleBar[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotLeftTriangleBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLeftTriangleBar.html
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
fun notLeftTriangleBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLeftTriangleBar", arguments.toMutableList(), options)
}
