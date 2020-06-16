package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AASTriangle
 *
 * Full name:        System`AASTriangle
 *
 * Usage:            AASTriangle[α, β, a] returns a filled triangle with angles α and β and side length a, where a is adjacent to one angle only.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AASTriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/AASTriangle.html
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
fun aASTriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AASTriangle", arguments.toMutableList(), options)
}
