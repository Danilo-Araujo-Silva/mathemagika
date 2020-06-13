package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticTheta
 *
 * Full name:        System`EllipticTheta
 *
 *                   EllipticTheta[a, u, q] gives the theta function ϑ (u, q) (a = 1, …, 4).
 *                                                                    a
 *                   EllipticTheta[a, q] gives the theta constant θ (q)  θ (0, q).
 * Usage:                                                          a       a
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EllipticTheta
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticTheta.html
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
fun ellipticTheta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticTheta", arguments.toMutableList(), options)
}
