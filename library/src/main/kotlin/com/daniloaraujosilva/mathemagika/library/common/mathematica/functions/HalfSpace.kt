package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HalfSpace
 *
 * Full name:        System`HalfSpace
 *
 *                   HalfSpace[n, p] represents the half-space of points x such that n . (x - p) ≤ 0.
 * Usage:            HalfSpace[n, c] represents the half-space of points x such that n . x ≤ c.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HalfSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/HalfSpace.html
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
fun halfSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HalfSpace", arguments.toMutableList(), options)
}
