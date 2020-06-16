package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Hypergeometric2F1Regularized
 *
 * Full name:        System`Hypergeometric2F1Regularized
 *
 *                   Hypergeometric2F1Regularized[a, b, c, z] is the regularized hypergeometric function    F  (a, b ; c ; z)/Γ(c).
 * Usage:                                                                                                 2    1
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Hypergeometric2F1Regularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hypergeometric2F1Regularized.html
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
fun hypergeometric2F1Regularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hypergeometric2F1Regularized", arguments.toMutableList(), options)
}
