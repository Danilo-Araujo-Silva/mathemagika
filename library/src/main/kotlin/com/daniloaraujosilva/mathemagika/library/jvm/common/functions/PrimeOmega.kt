package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrimeOmega
 *
 * Full name:        System`PrimeOmega
 *
 * Usage:            PrimeOmega[n] gives the number of prime factors counting multiplicities Ω(n) in n.
 *
 * Options:          GaussianIntegers -> False
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrimeOmega
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimeOmega.html
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
fun primeOmega(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimeOmega", arguments.toMutableList(), options)
}
