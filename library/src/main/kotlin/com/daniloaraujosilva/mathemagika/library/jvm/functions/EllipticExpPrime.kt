package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticExpPrime
 *
 * Full name:        System`EllipticExpPrime
 *
 * Usage:            EllipticExpPrime[u, {a, b}] gives the derivative of EllipticExp[u, {a, b}] with respect to u.
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EllipticExpPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticExpPrime.html
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
fun ellipticExpPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticExpPrime", arguments.toMutableList(), options)
}
