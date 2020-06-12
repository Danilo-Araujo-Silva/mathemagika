package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NDSolve
 *
 * Full name:        System`NDSolve
 *
 *                   NDSolve[eqns, u, {x, x   , x   }] finds a numerical solution to the ordinary differential equations eqns for the function u with the independent variable x in the range x    to x   .
 *                                         min   max                                                                                                                                           min     max
 *                   NDSolve[eqns, u, {x, x   , x   }, {y, y   , y   }] solves the partial differential equations eqns over a rectangular region.
 *                                         min   max        min   max
 *                   NDSolve[eqns, u, {x, y} ∈ Ω] solves the partial differential equations eqns over the region Ω.
 *                   NDSolve[eqns, u, {t, t   , t   }, {x, y} ∈ Ω] solves the time-dependent partial differential equations eqns over the region Ω.
 *                                         min   max
 *                   NDSolve[eqns, {u , u , …}, …] solves for the functions u .
 * Usage:                            1   2                                   i
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
 *                   local: paclet:ref/NDSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/NDSolve.html
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
fun nDSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NDSolve", arguments.toMutableList(), options)
}
