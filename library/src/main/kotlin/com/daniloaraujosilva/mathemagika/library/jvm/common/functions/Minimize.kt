package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Minimize
 *
 * Full name:        System`Minimize
 *
 *                   Minimize[f, x] minimizes f with respect to x.
 *                   Minimize[f, {x, y, …}] minimizes f with respect to x, y, ….
 *                   Minimize[{f, cons}, {x, y, …}] minimizes f subject to the constraints cons.
 *                   Minimize[…, x ∈ reg] constrains x to be in the region reg.
 * Usage:            Minimize[…, …, dom] constrains variables to the domain dom, typically Reals or Integers.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Minimize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Minimize.html
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
fun minimize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Minimize", arguments.toMutableList(), options)
}
