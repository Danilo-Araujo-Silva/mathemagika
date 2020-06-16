package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticE
 *
 * Full name:        System`EllipticE
 *
 *                   EllipticE[m] gives the complete elliptic integral E(m).
 * Usage:            EllipticE[ϕ, m] gives the elliptic integral of the second kind E(ϕ  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EllipticE
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticE.html
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
fun ellipticE(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticE", arguments.toMutableList(), options)
}
