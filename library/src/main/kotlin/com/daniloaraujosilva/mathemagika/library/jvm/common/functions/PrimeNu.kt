package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrimeNu
 *
 * Full name:        System`PrimeNu
 *
 * Usage:            PrimeNu[n] gives the number of distinct primes ν(n) in n.
 *
 * Options:          GaussianIntegers -> False
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrimeNu
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimeNu.html
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
fun primeNu(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimeNu", arguments.toMutableList(), options)
}
