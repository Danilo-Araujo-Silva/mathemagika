package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuCPrime
 *
 * Full name:        System`MathieuCPrime
 *
 * Usage:            MathieuCPrime[a, q, z] gives the derivative with respect to z of the even Mathieu function with characteristic value a and parameter q.
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MathieuCPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuCPrime.html
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
fun mathieuCPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuCPrime", arguments.toMutableList(), options)
}
