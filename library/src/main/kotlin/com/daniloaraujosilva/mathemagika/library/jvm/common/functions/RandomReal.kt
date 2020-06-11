package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RandomReal
 *
 * Full name:        System`RandomReal
 *
 *                   RandomReal[] gives a pseudorandom real number in the range 0 to 1.
 *                   RandomReal[{x   , x   }] gives a pseudorandom real number in the range x    to x   .
 *                                min   max                                                  min     max
 *                   RandomReal[x   ] gives a pseudorandom real number in the range 0 to x   .
 *                               max                                                      max
 *                   RandomReal[range, n] gives a list of n pseudorandom reals.
 *                   RandomReal[range, {n , n , …}] gives an n ×n ×… array of pseudorandom reals.
 * Usage:                                1   2                1  2
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomReal
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomReal.html
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
fun randomReal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomReal", arguments.toMutableList(), options)
}
