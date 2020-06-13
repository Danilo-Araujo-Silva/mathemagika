package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindRoot
 *
 * Full name:        System`FindRoot
 *
 *                   FindRoot[f, {x, x }] searches for a numerical root of f, starting from the point x = x .
 *                                    0                                                                    0
 *                   FindRoot[lhs == rhs, {x, x }] searches for a numerical solution to the equation lhs == rhs.
 *                                             0
 *                   FindRoot[{f , f , …}, {{x, x }, {y, y }, …}] searches for a simultaneous numerical root of all the f .
 *                              1   2            0        0                                                              i
 *                   FindRoot[{eqn , eqn , …}, {{x, x }, {y, y }, …}] searches for a numerical solution to the simultaneous equations eqn .
 * Usage:                         1     2            0        0                                                                          i
 *
 *                   AccuracyGoal -> Automatic
 *                   Compiled -> Automatic
 *                   DampingFactor -> 1
 *                   Evaluated -> True
 *                   EvaluationMonitor -> None
 *                   Jacobian -> Automatic
 *                   MaxIterations -> 100
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   StepMonitor -> None
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindRoot
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindRoot.html
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
fun findRoot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindRoot", arguments.toMutableList(), options)
}
