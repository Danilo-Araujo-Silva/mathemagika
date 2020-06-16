package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HeunDPrime
 *
 * Full name:        System`HeunDPrime
 *
 * Usage:            HeunDPrime[q, α, γ, δ, ϵ, z] gives the z-derivative of the HeunD function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeunDPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeunDPrime.html
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
fun heunDPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeunDPrime", arguments.toMutableList(), options)
}
