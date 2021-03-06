package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SSSTriangle
 *
 * Full name:        System`SSSTriangle
 *
 * Usage:            SSSTriangle[a, b, c] returns a filled triangle with sides of lengths a, b, and c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SSSTriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/SSSTriangle.html
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
fun sSSTriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SSSTriangle", arguments.toMutableList(), options)
}
