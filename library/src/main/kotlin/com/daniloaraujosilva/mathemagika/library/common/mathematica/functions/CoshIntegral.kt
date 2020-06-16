package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CoshIntegral
 *
 * Full name:        System`CoshIntegral
 *
 * Usage:            CoshIntegral[z] gives the hyperbolic cosine integral Chi(z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoshIntegral
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoshIntegral.html
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
fun coshIntegral(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoshIntegral", arguments.toMutableList(), options)
}
