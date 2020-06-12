package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SASTriangle
 *
 * Full name:        System`SASTriangle
 *
 * Usage:            SASTriangle[a, γ, b] returns a filled triangle with sides of length a and b and angle γ between them.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SASTriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/SASTriangle.html
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
fun sASTriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SASTriangle", arguments.toMutableList(), options)
}
