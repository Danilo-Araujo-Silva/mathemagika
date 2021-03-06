package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Norm
 *
 * Full name:        System`Norm
 *
 *                   Norm[expr] gives the norm of a number, vector, or matrix.
 * Usage:            Norm[expr, p] gives the p‐norm.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Norm
 * Documentation:    web: http://reference.wolfram.com/language/ref/Norm.html
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
fun norm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Norm", arguments.toMutableList(), options)
}
