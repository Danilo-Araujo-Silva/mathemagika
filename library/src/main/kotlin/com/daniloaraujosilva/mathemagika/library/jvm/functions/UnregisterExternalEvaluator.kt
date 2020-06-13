package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UnregisterExternalEvaluator
 *
 * Full name:        System`UnregisterExternalEvaluator
 *
 *                   UnregisterExternalEvaluator[sys, exec] unregisters the external evaluator at location exec for system sys so that it is not used by ExternalEvaluate and related functions.
 * Usage:            UnregisterExternalEvaluator[uuid] unregisters the external evaluator with the specified registration UUID.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnregisterExternalEvaluator
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnregisterExternalEvaluator.html
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
fun unregisterExternalEvaluator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnregisterExternalEvaluator", arguments.toMutableList(), options)
}
