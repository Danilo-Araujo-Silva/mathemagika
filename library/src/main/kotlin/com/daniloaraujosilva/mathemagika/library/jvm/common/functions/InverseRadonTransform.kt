package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseRadonTransform
 *
 * Full name:        System`InverseRadonTransform
 *
 * Usage:            InverseRadonTransform[expr, {p, ϕ}, {x, y}] gives the inverse Radon transform of expr.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseRadonTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseRadonTransform.html
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
fun inverseRadonTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseRadonTransform", arguments.toMutableList(), options)
}
