package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ZTransform
 *
 * Full name:        System`ZTransform
 *
 *                   ZTransform[expr, n, z] gives the Z transform of expr.
 *                   ZTransform[expr, {n , n , …}, {z , z , …}] gives the multidimensional Z transform of expr.
 * Usage:                               1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          VerifyConvergence -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ZTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZTransform.html
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
fun zTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZTransform", arguments.toMutableList(), options)
}
