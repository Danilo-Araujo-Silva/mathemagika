package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuSPrime
 *
 * Full name:        System`MathieuSPrime
 *
 * Usage:            MathieuSPrime[a, q, z] gives the derivative with respect to z of the odd Mathieu function with characteristic value a and parameter q.
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MathieuSPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuSPrime.html
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
fun mathieuSPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuSPrime", arguments.toMutableList(), options)
}
