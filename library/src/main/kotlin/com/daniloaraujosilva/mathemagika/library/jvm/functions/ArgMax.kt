package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArgMax
 *
 * Full name:        System`ArgMax
 *
 *                   ArgMax[f, x] gives a position x    at which f is maximized.
 *                                                  max
 *                   ArgMax[f, {x, y, …}] gives a position {x   , y   , …} at which f is maximized.
 *                                                           max   max
 *                   ArgMax[{f, cons}, {x, y, …}] gives a position at which f is maximized subject to the constraints cons.
 *                   ArgMax[…, x ∈ reg] constrains x to be in the region reg.
 * Usage:            ArgMax[…, …, dom] constrains variables to the domain dom, typically Reals or Integers.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArgMax
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArgMax.html
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
fun argMax(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArgMax", arguments.toMutableList(), options)
}
