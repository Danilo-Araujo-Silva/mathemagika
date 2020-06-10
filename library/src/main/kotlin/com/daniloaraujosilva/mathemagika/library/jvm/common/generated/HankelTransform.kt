package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HankelTransform
 * 
 * Full name:        System`HankelTransform
 * 
 *                   HankelTransform[expr, r, s] gives the Hankel transform of order 0 for expr.
 * Usage:            HankelTransform[expr, r, s, ν] gives the Hankel transform of order ν for expr.
 * 
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HankelTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/HankelTransform.html
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
fun hankelTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HankelTransform", arguments.toMutableList(), options)
}
