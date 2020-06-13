package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Maximize
 *
 * Full name:        System`Maximize
 *
 *                   Maximize[f, x] maximizes f with respect to x.
 *                   Maximize[f, {x, y, …}] maximizes f with respect to x, y, ….
 *                   Maximize[{f, cons}, {x, y, …}] maximizes f subject to the constraints cons.
 *                   Maximize[…, x ∈ reg] constrains x to be in the region reg.
 * Usage:            Maximize[…, …, dom] constrains variables to the domain dom, typically Reals or Integers.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Maximize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Maximize.html
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
fun maximize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Maximize", arguments.toMutableList(), options)
}
