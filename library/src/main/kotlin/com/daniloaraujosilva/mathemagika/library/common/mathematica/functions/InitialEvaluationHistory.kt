package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InitialEvaluationHistory
 *
 * Full name:        System`InitialEvaluationHistory
 *
 * Usage:            InitialEvaluationHistory is an option for functions such as BayesianMinimization that gives an initial set of configurations and values.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InitialEvaluationHistory
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitialEvaluationHistory.html
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
fun initialEvaluationHistory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitialEvaluationHistory", arguments.toMutableList(), options)
}
