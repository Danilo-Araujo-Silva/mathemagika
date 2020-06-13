package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindFit
 *
 * Full name:        System`FindFit
 *
 *                   FindFit[data, expr, pars, vars] finds numerical values of the parameters pars that make expr give a best fit to data as a function of vars.
 * Usage:            FindFit[data, {expr, cons}, pars, vars] finds a best fit subject to the parameter constraints cons.
 *
 *                   AccuracyGoal -> Automatic
 *                   Compiled -> Automatic
 *                   EvaluationMonitor -> None
 *                   FitRegularization -> None
 *                   Gradient -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   NormFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   StepMonitor -> None
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindFit.html
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
fun findFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindFit", arguments.toMutableList(), options)
}
