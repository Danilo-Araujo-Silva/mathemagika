package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EllipticThetaPrime
 * 
 * Full name:        System`EllipticThetaPrime
 * 
 *                   EllipticThetaPrime[a, u, q] gives the derivative with respect to u of the theta function ϑ (u, q) (a = 1, …, 4).
 *                                                                                                             a
 *                                                                       ′
 *                   EllipticThetaPrime[a, q] gives the theta constant θ  (0, q).
 * Usage:                                                               a
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/EllipticThetaPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticThetaPrime.html
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
fun ellipticThetaPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticThetaPrime", arguments.toMutableList(), options)
}
