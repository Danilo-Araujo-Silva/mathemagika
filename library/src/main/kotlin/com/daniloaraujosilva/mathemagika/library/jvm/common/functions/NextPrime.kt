package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NextPrime
 *
 * Full name:        System`NextPrime
 *
 *                   NextPrime[x] gives the smallest prime above x.
 *                                               th
 * Usage:            NextPrime[x, k] gives the k  -next prime above x.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NextPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/NextPrime.html
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
fun nextPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NextPrime", arguments.toMutableList(), options)
}
