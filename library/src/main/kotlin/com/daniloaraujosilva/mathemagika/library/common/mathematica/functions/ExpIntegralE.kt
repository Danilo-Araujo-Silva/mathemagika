package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExpIntegralE
 *
 * Full name:        System`ExpIntegralE
 *
 *                   ExpIntegralE[n, z] gives the exponential integral function E (z).
 * Usage:                                                                        n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExpIntegralE
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpIntegralE.html
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
fun expIntegralE(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpIntegralE", arguments.toMutableList(), options)
}
