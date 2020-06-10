package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Primes
 * 
 * Full name:        System`Primes
 * 
 * Usage:            Primes represents the domain of prime numbers, as in x ∈ Primes. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Primes
 * Documentation:    web: http://reference.wolfram.com/language/ref/Primes.html
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
fun primes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Primes", arguments.toMutableList(), options)
}
