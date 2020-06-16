package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HypergeometricU
 *
 * Full name:        System`HypergeometricU
 *
 * Usage:            HypergeometricU[a, b, z] is the confluent hypergeometric function U(a, b, z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HypergeometricU
 * Documentation:    web: http://reference.wolfram.com/language/ref/HypergeometricU.html
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
fun hypergeometricU(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HypergeometricU", arguments.toMutableList(), options)
}
