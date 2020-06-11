package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RandomVariate
 *
 * Full name:        System`RandomVariate
 *
 *                   RandomVariate[dist] gives a pseudorandom variate from the symbolic distribution dist.
 *                   RandomVariate[dist, n] gives a list of n pseudorandom variates from the symbolic distribution dist.
 *                   RandomVariate[dist, {n , n , …}] gives an n  × n  × … array of pseudorandom variates from the symbolic distribution dist.
 * Usage:                                  1   2                1    2
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomVariate
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomVariate.html
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
fun randomVariate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomVariate", arguments.toMutableList(), options)
}
