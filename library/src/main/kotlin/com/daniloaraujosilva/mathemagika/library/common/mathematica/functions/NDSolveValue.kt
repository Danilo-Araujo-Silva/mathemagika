package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NDSolveValue
 *
 * Full name:        System`NDSolveValue
 *
 *                   NDSolveValue[eqns, expr, {x, x   , x   }] gives the value of expr with functions determined by a numerical solution to the ordinary differential equations eqns with the independent variable x in the range x    to x   .
 *                                                 min   max                                                                                                                                                                       min     max
 *                   NDSolveValue[eqns, expr, {x, x   , x   }, {y, y   , y   }] solves the partial differential equations eqns over a rectangular region.
 *                                                 min   max        min   max
 *                   NDSolveValue[eqns, expr, {x, y} ∈ Ω] solves the partial differential equations eqns over the region Ω.
 *                   NDSolveValue[eqns, u, {t, t   , t   }, {x, y} ∈ Ω] solves the time-dependent partial differential equations eqns over the region Ω.
 * Usage:                                       min   max
 *
 *                   AccuracyGoal -> Automatic
 *                   Compiled -> Automatic
 *                   DependentVariables -> Automatic
 *                   DiscreteVariables -> {}
 *                   EvaluationMonitor -> None
 *                   InitialSeeding -> {}
 *                   InterpolationOrder -> Automatic
 *                                      1
 *                   MaxStepFraction -> --
 *                                      10
 *                   MaxSteps -> Automatic
 *                   MaxStepSize -> Automatic
 *                   Method -> Automatic
 *                   NormFunction -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   StartingStepSize -> Automatic
 *                   StepMonitor -> None
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NDSolveValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/NDSolveValue.html
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
fun nDSolveValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NDSolveValue", arguments.toMutableList(), options)
}
