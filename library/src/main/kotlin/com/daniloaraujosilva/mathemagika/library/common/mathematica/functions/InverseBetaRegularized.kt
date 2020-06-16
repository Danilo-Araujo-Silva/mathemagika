package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseBetaRegularized
 *
 * Full name:        System`InverseBetaRegularized
 *
 * Usage:            InverseBetaRegularized[s, a, b] gives the inverse of the regularized incomplete beta function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseBetaRegularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseBetaRegularized.html
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
fun inverseBetaRegularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseBetaRegularized", arguments.toMutableList(), options)
}
