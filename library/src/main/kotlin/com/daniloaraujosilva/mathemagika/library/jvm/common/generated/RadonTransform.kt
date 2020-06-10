package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RadonTransform
 * 
 * Full name:        System`RadonTransform
 * 
 * Usage:            RadonTransform[expr, {x, y}, {p, ϕ}] gives the Radon transform of expr.
 * 
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RadonTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadonTransform.html
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
fun radonTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadonTransform", arguments.toMutableList(), options)
}
