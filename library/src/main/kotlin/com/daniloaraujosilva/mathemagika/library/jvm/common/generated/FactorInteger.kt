package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FactorInteger
 * 
 * Full name:        System`FactorInteger
 * 
 *                   FactorInteger[n] gives a list of the prime factors of the integer n, together with their exponents. 
 * Usage:            FactorInteger[n, k] does partial factorization, pulling out at most k distinct factors.
 * 
 * Options:          GaussianIntegers -> False
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FactorInteger
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorInteger.html
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
fun factorInteger(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorInteger", arguments.toMutableList(), options)
}
