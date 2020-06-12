package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LeftTriangleEqual
 *
 * Full name:        System`LeftTriangleEqual
 *
 * Usage:            LeftTriangleEqual[x, y, …] displays as x ⊴ y ⊴ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftTriangleEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftTriangleEqual.html
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
fun leftTriangleEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftTriangleEqual", arguments.toMutableList(), options)
}
