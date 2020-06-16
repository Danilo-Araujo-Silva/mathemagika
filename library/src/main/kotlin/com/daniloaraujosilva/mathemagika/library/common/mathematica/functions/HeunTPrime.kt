package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HeunTPrime
 *
 * Full name:        System`HeunTPrime
 *
 * Usage:            HeunTPrime[q, α, γ, δ, ϵ, z] gives the z-derivative of the HeunT function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeunTPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeunTPrime.html
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
fun heunTPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeunTPrime", arguments.toMutableList(), options)
}
