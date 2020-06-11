package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticPi
 *
 * Full name:        System`EllipticPi
 *
 *                   EllipticPi[n, m] gives the complete elliptic integral of the third kind Π (n  m).
 * Usage:            EllipticPi[n, ϕ, m] gives the incomplete elliptic integral Π (n ; ϕ  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EllipticPi
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticPi.html
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
fun ellipticPi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticPi", arguments.toMutableList(), options)
}
