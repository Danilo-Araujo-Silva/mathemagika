package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BetaRegularized
 *
 * Full name:        System`BetaRegularized
 *
 *                   BetaRegularized[z, a, b] gives the regularized incomplete beta function I (a, b).
 * Usage:                                                                                     z
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BetaRegularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/BetaRegularized.html
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
fun betaRegularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BetaRegularized", arguments.toMutableList(), options)
}
