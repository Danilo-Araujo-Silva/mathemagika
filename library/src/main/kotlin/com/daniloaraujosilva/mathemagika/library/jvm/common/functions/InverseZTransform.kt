package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseZTransform
 *
 * Full name:        System`InverseZTransform
 *
 *                   InverseZTransform[expr, z, n] gives the inverse Z transform of expr.
 *                   InverseZTransform[expr, {z , z , …}, {n , n , …}] gives the multiple inverse Z transform of expr.
 * Usage:                                      1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseZTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseZTransform.html
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
fun inverseZTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseZTransform", arguments.toMutableList(), options)
}
