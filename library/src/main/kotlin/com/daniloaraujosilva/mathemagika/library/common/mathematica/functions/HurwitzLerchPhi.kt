package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HurwitzLerchPhi
 *
 * Full name:        System`HurwitzLerchPhi
 *
 * Usage:            HurwitzLerchPhi[z, s, a] gives the Hurwitz–Lerch transcendent Φ(z, s, a).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HurwitzLerchPhi
 * Documentation:    web: http://reference.wolfram.com/language/ref/HurwitzLerchPhi.html
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
fun hurwitzLerchPhi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HurwitzLerchPhi", arguments.toMutableList(), options)
}
