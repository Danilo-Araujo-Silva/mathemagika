package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindProcessParameters
 *
 * Full name:        System`FindProcessParameters
 *
 *                   FindProcessParameters[data, proc] finds the parameter estimates for the process proc from data.
 *                   FindProcessParameters[data, proc, {{p, p }, {q, q }, …}] finds the parameters p, q, … with starting values p , q , … .
 * Usage:                                                    0        0                                                          0   0
 *
 *                   AccuracyGoal -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   ProcessEstimator -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindProcessParameters
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindProcessParameters.html
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
fun findProcessParameters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindProcessParameters", arguments.toMutableList(), options)
}
