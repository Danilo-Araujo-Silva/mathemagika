package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RandomPoint
 *
 * Full name:        System`RandomPoint
 *
 *                   RandomPoint[reg] gives a pseudorandom point uniformly distributed in the region reg.
 *                   RandomPoint[reg, n] gives a list of n pseudorandom points uniformly distributed in the region reg.
 *                   RandomPoint[reg, {n , n , …}] gives an n  × n  × … array of pseudorandom points.
 *                                      1   2                1    2
 *                   RandomPoint[reg, …, {{x   , x   }, …}] restricts to the bounds [x   , x   ] × ⋯.
 * Usage:                                   min   max                                 min   max
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomPoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomPoint.html
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
fun randomPoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomPoint", arguments.toMutableList(), options)
}
