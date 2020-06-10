package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MaxValue
 * 
 * Full name:        System`MaxValue
 * 
 *                   MaxValue[f, x] gives the maximum value of f with respect to x.
 *                   MaxValue[f, {x, y, …}] gives the maximum value of f with respect to x, y, …. 
 *                   MaxValue[{f, cons}, {x, y, …}] gives the maximum value of f subject to the constraints cons. 
 *                   MaxValue[…, x ∈ reg] constrains x to be in the region reg.
 * Usage:            MaxValue[…, …, dom] constrains variables to the domain dom, typically Reals or Integers.
 * 
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MaxValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxValue.html
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
fun maxValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxValue", arguments.toMutableList(), options)
}
