package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrimeQ
 *
 * Full name:        System`PrimeQ
 *
 * Usage:            PrimeQ[n] yields True if n is a prime number, and yields False otherwise.
 *
 * Options:          GaussianIntegers -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrimeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimeQ.html
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
fun primeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimeQ", arguments.toMutableList(), options)
}
