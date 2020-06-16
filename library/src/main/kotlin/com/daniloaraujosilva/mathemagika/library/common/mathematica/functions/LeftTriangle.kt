package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftTriangle
 *
 * Full name:        System`LeftTriangle
 *
 * Usage:            LeftTriangle[x, y, …] displays as x ⊲ y ⊲ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftTriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftTriangle.html
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
fun leftTriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftTriangle", arguments.toMutableList(), options)
}
