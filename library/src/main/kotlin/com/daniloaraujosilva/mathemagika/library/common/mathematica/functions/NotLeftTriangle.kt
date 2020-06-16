package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotLeftTriangle
 *
 * Full name:        System`NotLeftTriangle
 *
 * Usage:            NotLeftTriangle[x, y, …] displays as x ⋪ y ⋪ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotLeftTriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLeftTriangle.html
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
fun notLeftTriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLeftTriangle", arguments.toMutableList(), options)
}
