package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EulerPhi
 *
 * Full name:        System`EulerPhi
 *
 * Usage:            EulerPhi[n] gives the Euler totient function ϕ(n).
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EulerPhi
 * Documentation:    web: http://reference.wolfram.com/language/ref/EulerPhi.html
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
fun eulerPhi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EulerPhi", arguments.toMutableList(), options)
}
