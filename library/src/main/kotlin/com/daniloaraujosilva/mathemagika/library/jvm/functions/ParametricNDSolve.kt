package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ParametricNDSolve
 *
 * Full name:        System`ParametricNDSolve
 *
 *                   ParametricNDSolve[eqns, u, {x, x   , x   }, pars] finds a numerical solution to the ordinary differential equations eqns for the function u with the independent variable x in the range x    to x    with parameters pars.
 *                                                   min   max                                                                                                                                                 min     max
 *                   ParametricNDSolve[eqns, u, {x, x   , x   }, {y, y   , y   }, pars] solves the partial differential equations eqns over a rectangular region.
 *                                                   min   max        min   max
 *                   ParametricNDSolve[eqns, u, {x, y} ∈ Ω, pars] solves the partial differential equations eqns over the region Ω.
 *                   ParametricNDSolve[eqns, u, {t, t   , t   }, {x, y} ∈ Ω, pars] solves the time-dependent partial differential equations eqns over the region Ω.
 *                                                   min   max
 *                   ParametricNDSolve[eqns, {u , u , …}, …] solves for the functions u .
 * Usage:                                      1   2                                   i
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
 *                   local: paclet:ref/ParametricNDSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParametricNDSolve.html
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
fun parametricNDSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParametricNDSolve", arguments.toMutableList(), options)
}
