package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MinValue
 *
 * Full name:        System`MinValue
 *
 *                   MinValue[f, x] gives the minimum value of f with respect to x.
 *                   MinValue[f, {x, y, …}] gives the minimum value of f with respect to x, y, ….
 *                   MinValue[{f, cons}, {x, y, …}] gives the minimum value of f subject to the constraints cons.
 *                   MinValue[…, x ∈ reg] constrains x to be in the region reg.
 * Usage:            MinValue[…, …, dom] constrains variables to the domain dom, typically Reals or Integers.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinValue.html
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
fun minValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinValue", arguments.toMutableList(), options)
}
