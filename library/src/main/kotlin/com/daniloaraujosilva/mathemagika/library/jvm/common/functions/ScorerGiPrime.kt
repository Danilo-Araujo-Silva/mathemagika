package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScorerGiPrime
 *
 * Full name:        System`ScorerGiPrime
 *
 *                                                                                  ′
 * Usage:            ScorerGiPrime[z] gives the derivative of the Scorer function Gi (z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScorerGiPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScorerGiPrime.html
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
fun scorerGiPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScorerGiPrime", arguments.toMutableList(), options)
}
