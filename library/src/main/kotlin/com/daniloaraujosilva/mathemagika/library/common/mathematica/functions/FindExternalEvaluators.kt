package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindExternalEvaluators
 *
 * Full name:        System`FindExternalEvaluators
 *
 *                   FindExternalEvaluators[] finds installed external evaluators that can be used with ExternalEvaluate, returning a dataset of the results found.
 * Usage:            FindExternalEvaluators["sys"] finds only external evaluators for language or system sys.
 *
 * Options:          ResetCache -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindExternalEvaluators
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindExternalEvaluators.html
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
fun findExternalEvaluators(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindExternalEvaluators", arguments.toMutableList(), options)
}
