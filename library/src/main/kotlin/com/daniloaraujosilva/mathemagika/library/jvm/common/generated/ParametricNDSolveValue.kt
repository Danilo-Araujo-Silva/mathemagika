package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParametricNDSolveValue
 * 
 * Full name:        System`ParametricNDSolveValue
 * 
 *                   ParametricNDSolveValue[eqns, expr, {x, x   , x   }, pars] gives the value of expr with functions determined by a numerical solution to the ordinary differential equations eqns with the independent variable x in the range x    to x    with parameters pars.
 *                                                           min   max                                                                                                                                                                             min     max
 *                   ParametricNDSolveValue[eqns, expr, {x, x   , x   }, {y, y   , y   }, pars] solves the partial differential equations eqns over a rectangular region.
 *                                                           min   max        min   max
 *                   ParametricNDSolveValue[eqns, expr, {x, y} ∈ Ω, pars] solves the partial differential equations eqns over the region Ω.
 *                   ParametricNDSolveValue[eqns, expr, {t, t   , t   }, {x, y} ∈ Ω, pars] solves the time-dependent partial differential equations eqns over the region Ω.
 * Usage:                                                    min   max
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
 *                   local: paclet:ref/ParametricNDSolveValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParametricNDSolveValue.html
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
fun parametricNDSolveValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParametricNDSolveValue", arguments.toMutableList(), options)
}
