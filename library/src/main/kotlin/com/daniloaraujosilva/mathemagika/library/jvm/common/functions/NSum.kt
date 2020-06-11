package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NSum
 *
 * Full name:        System`NSum
 *
 *                                                                                         i
 *                                                                                          max
 *                   NSum[f, {i, i   , i   }] gives a numerical approximation to the sum    ∑     f.
 *                                min   max                                              i = i
 *                                                                                            min
 *                   NSum[f, {i, i   , i   , di}] uses a step di in the sum.
 * Usage:                         min   max
 *
 *                   AccuracyGoal -> Infinity
 *                   Compiled -> Automatic
 *                   EvaluationMonitor -> None
 *                   Method -> Automatic
 *                   NSumTerms -> 15
 *                   PrecisionGoal -> Automatic
 *                   VerifyConvergence -> True
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NSum
 * Documentation:    web: http://reference.wolfram.com/language/ref/NSum.html
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
fun nSum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NSum", arguments.toMutableList(), options)
}
