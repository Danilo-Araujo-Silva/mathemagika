package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EstimatedProcess
 *
 * Full name:        System`EstimatedProcess
 *
 *                   EstimatedProcess[data, proc] estimates the parametric process proc from data.
 *                   EstimatedProcess[data, proc, {{p, p }, {q, q }, …}] estimates the parameters p, q, … with starting values p , q , ….
 *                                                      0        0                                                              0   0
 * Usage:            EstimatedProcess[data, proc, iproc] estimates process proc with starting values taken from the instantiated process iproc.
 *
 *                   AccuracyGoal -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   ProcessEstimator -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EstimatedProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/EstimatedProcess.html
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
fun estimatedProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EstimatedProcess", arguments.toMutableList(), options)
}
