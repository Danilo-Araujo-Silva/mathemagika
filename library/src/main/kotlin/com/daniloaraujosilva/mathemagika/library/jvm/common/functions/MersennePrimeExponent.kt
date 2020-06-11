package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MersennePrimeExponent
 *
 * Full name:        System`MersennePrimeExponent
 *
 *                                                        th
 * Usage:            MersennePrimeExponent[n] gives the n   Mersenne prime exponent.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MersennePrimeExponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/MersennePrimeExponent.html
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
fun mersennePrimeExponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MersennePrimeExponent", arguments.toMutableList(), options)
}
