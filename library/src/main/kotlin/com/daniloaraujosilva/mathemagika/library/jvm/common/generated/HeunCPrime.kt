package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HeunCPrime
 * 
 * Full name:        System`HeunCPrime
 * 
 * Usage:            HeunCPrime[q, α, γ, δ, ϵ, z] gives the z-derivative of the HeunC function. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HeunCPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeunCPrime.html
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
fun heunCPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeunCPrime", arguments.toMutableList(), options)
}
