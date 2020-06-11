package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LeftTriangleBar
 *
 * Full name:        System`LeftTriangleBar
 *
 * Usage:            LeftTriangleBar[x, y, …] displays as x ⧏ y ⧏ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftTriangleBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftTriangleBar.html
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
fun leftTriangleBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftTriangleBar", arguments.toMutableList(), options)
}
