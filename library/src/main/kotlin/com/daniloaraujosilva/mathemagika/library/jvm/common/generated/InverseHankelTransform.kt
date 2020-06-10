package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseHankelTransform
 * 
 * Full name:        System`InverseHankelTransform
 * 
 *                   InverseHankelTransform[expr, s, r] gives the inverse Hankel transform of order 0 for expr.
 * Usage:            InverseHankelTransform[expr, s, r, ν] gives the inverse Hankel transform of order ν for expr.
 * 
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseHankelTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseHankelTransform.html
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
fun inverseHankelTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseHankelTransform", arguments.toMutableList(), options)
}
