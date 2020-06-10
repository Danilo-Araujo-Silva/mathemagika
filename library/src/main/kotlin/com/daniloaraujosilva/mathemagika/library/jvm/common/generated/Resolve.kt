package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Resolve
 * 
 * Full name:        System`Resolve
 * 
 *                   Resolve[expr] attempts to resolve expr into a form that eliminates ForAll and Exists quantifiers. 
 * Usage:            Resolve[expr, dom] works over the domain dom. Common choices of dom are Complexes, Reals, and Booleans. 
 * 
 *                   Backsubstitution -> False
 *                   Cubics -> False
 *                   Method -> Automatic
 *                   Quartics -> False
 * Options:          WorkingPrecision -> Infinity
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Resolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/Resolve.html
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
fun resolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Resolve", arguments.toMutableList(), options)
}
