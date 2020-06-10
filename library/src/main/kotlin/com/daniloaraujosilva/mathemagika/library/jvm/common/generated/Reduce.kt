package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Reduce
 * 
 * Full name:        System`Reduce
 * 
 *                   Reduce[expr, vars] reduces the statement expr by solving equations or inequalities for vars and eliminating quantifiers. 
 * Usage:            Reduce[expr, vars, dom] does the reduction over the domain dom. Common choices of dom are Reals, Integers, and Complexes. 
 * 
 *                   Backsubstitution -> False
 *                   Cubics -> False
 *                   GeneratedParameters -> C
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   Quartics -> False
 * Options:          WorkingPrecision -> Infinity
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Reduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/Reduce.html
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
fun reduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Reduce", arguments.toMutableList(), options)
}
