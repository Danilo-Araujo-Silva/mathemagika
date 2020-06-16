package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LogisticSigmoid
 *
 * Full name:        System`LogisticSigmoid
 *
 * Usage:            LogisticSigmoid[z] gives the logistic sigmoid function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogisticSigmoid
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogisticSigmoid.html
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
fun logisticSigmoid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogisticSigmoid", arguments.toMutableList(), options)
}
