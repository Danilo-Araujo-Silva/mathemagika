package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotLeftTriangleEqual
 *
 * Full name:        System`NotLeftTriangleEqual
 *
 * Usage:            NotLeftTriangleEqual[x, y, …] displays as x ⋬ y ⋬ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotLeftTriangleEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLeftTriangleEqual.html
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
fun notLeftTriangleEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLeftTriangleEqual", arguments.toMutableList(), options)
}
