package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RandomComplex
 *
 * Full name:        System`RandomComplex
 *
 *                   RandomComplex[] gives a pseudorandom complex number with real and imaginary parts in the range 0 to 1.
 *                   RandomComplex[{z   , z   }] gives a pseudorandom complex number in the rectangle with corners given by the complex numbers z    and z   .
 *                                   min   max                                                                                                   min      max
 *                   RandomComplex[z   ] gives a pseudorandom complex number in the rectangle whose corners are the origin and z   .
 *                                  max                                                                                         max
 *                   RandomComplex[range, n] gives a list of n pseudorandom complex numbers.
 *                   RandomComplex[range, {n , n , …}] gives an n ×n ×… array of pseudorandom complex numbers.
 * Usage:                                   1   2                1  2
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomComplex
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomComplex.html
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
fun randomComplex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomComplex", arguments.toMutableList(), options)
}
