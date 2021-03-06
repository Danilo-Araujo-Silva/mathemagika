package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseMellinTransform
 *
 * Full name:        System`InverseMellinTransform
 *
 * Usage:            InverseMellinTransform[expr, s, x] gives the inverse Mellin transform of expr.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseMellinTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseMellinTransform.html
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
fun inverseMellinTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseMellinTransform", arguments.toMutableList(), options)
}
