package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticF
 *
 * Full name:        System`EllipticF
 *
 * Usage:            EllipticF[ϕ, m] gives the elliptic integral of the first kind F(ϕ  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EllipticF
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticF.html
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
fun ellipticF(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticF", arguments.toMutableList(), options)
}
