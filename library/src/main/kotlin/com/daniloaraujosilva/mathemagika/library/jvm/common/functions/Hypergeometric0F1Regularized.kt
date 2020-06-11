package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Hypergeometric0F1Regularized
 *
 * Full name:        System`Hypergeometric0F1Regularized
 *
 *                   Hypergeometric0F1Regularized[a, z] is the regularized confluent hypergeometric function    F  (a ; z)/Γ(a).
 * Usage:                                                                                                     0    1
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Hypergeometric0F1Regularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hypergeometric0F1Regularized.html
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
fun hypergeometric0F1Regularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hypergeometric0F1Regularized", arguments.toMutableList(), options)
}
