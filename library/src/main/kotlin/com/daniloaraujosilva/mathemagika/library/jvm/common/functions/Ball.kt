package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Ball
 *
 * Full name:        System`Ball
 *
 *                   Ball[p] represents the unit ball centered at the point p.
 *                   Ball[p, r] represents the ball of radius r centered at the point p.
 *                   Ball[{p , p , …}, r] represents a collection of balls of radius r.
 * Usage:                   1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Ball
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ball.html
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
fun ball(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ball", arguments.toMutableList(), options)
}
