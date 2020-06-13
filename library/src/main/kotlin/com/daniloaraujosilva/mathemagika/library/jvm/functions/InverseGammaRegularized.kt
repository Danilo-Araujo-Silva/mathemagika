package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseGammaRegularized
 *
 * Full name:        System`InverseGammaRegularized
 *
 * Usage:            InverseGammaRegularized[a, s] gives the inverse of the regularized incomplete gamma function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseGammaRegularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseGammaRegularized.html
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
fun inverseGammaRegularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseGammaRegularized", arguments.toMutableList(), options)
}
