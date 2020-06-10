package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RandomPrime
 * 
 * Full name:        System`RandomPrime
 * 
 *                   RandomPrime[{i   , i   }] gives a pseudorandom prime number in the range i    to i   .
 *                                 min   max                                                   min     max
 *                   RandomPrime[i   ] gives a pseudorandom prime number in the range 2 to i   .
 *                                max                                                       max
 * Usage:            RandomPrime[range, n] gives a list of n pseudorandom primes.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RandomPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomPrime.html
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
fun randomPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomPrime", arguments.toMutableList(), options)
}
