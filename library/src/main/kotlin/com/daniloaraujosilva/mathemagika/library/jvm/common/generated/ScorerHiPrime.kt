package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ScorerHiPrime
 * 
 * Full name:        System`ScorerHiPrime
 * 
 *                                                                                  ′
 * Usage:            ScorerHiPrime[z] gives the derivative of the Scorer function Hi (z).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ScorerHiPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScorerHiPrime.html
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
fun scorerHiPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScorerHiPrime", arguments.toMutableList(), options)
}
