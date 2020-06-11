package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegisterExternalEvaluator
 *
 * Full name:        System`RegisterExternalEvaluator
 *
 * Usage:            RegisterExternalEvaluator[sys, exec] registers the executable exec for use as an external evaluator with the language or system sys.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegisterExternalEvaluator
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegisterExternalEvaluator.html
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
fun registerExternalEvaluator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegisterExternalEvaluator", arguments.toMutableList(), options)
}
