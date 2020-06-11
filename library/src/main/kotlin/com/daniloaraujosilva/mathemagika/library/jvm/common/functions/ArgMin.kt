package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArgMin
 *
 * Full name:        System`ArgMin
 *
 *                   ArgMin[f, x] gives a position x    at which f is minimized.
 *                                                  min
 *                   ArgMin[f, {x, y, …}] gives a position {x   , y   , …} at which f is minimized.
 *                                                           min   min
 *                   ArgMin[{f, cons}, {x, y, …}] gives a position at which f is minimized subject to the constraints cons.
 *                   ArgMin[…, x ∈ reg] constrains x to be in the region reg.
 * Usage:            ArgMin[…, …, dom] constrains variables to the domain dom, typically Reals or Integers.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArgMin
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArgMin.html
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
fun argMin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArgMin", arguments.toMutableList(), options)
}
