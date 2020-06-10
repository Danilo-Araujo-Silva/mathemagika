package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LaplaceTransform
 * 
 * Full name:        System`LaplaceTransform
 * 
 *                   LaplaceTransform[expr, t, s] gives the Laplace transform of expr. 
 *                   LaplaceTransform[expr, {t , t , …}, {s , s , …}] gives the multidimensional Laplace transform of expr. 
 * Usage:                                     1   2        1   2
 * 
 *                   Analytic -> True
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          PrincipalValue -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LaplaceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/LaplaceTransform.html
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
fun laplaceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LaplaceTransform", arguments.toMutableList(), options)
}
