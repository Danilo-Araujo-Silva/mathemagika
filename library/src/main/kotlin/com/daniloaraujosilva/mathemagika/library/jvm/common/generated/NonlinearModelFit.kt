package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NonlinearModelFit
 * 
 * Full name:        System`NonlinearModelFit
 * 
 *                   NonlinearModelFit[{y , y , …}, form, {β , …}, x] constructs a nonlinear model with structure form that fits the y  for successive x values 1, 2, … using the parameters β , ….
 *                                       1   2              1                                                                         i                                                       1
 *                   NonlinearModelFit[{{x  , x  , …, y }, {x  , x  , …, y }, …}, form, {β , …}, {x , …}] constructs a nonlinear model where form depends on the variables x . 
 *                                        11   12      1     21   22      2               1        1                                                                        k
 *                   NonlinearModelFit[data, {form, cons}, {β , …}, {x , …}] constructs a nonlinear model subject to the parameter constraints cons.
 * Usage:                                                    1        1
 * 
 *                   AccuracyGoal -> Automatic
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   EvaluationMonitor -> None
 *                   Gradient -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   StepMonitor -> None
 *                   Tolerance -> Automatic
 *                   VarianceEstimatorFunction -> Automatic
 *                   Weights -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NonlinearModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonlinearModelFit.html
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
fun nonlinearModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonlinearModelFit", arguments.toMutableList(), options)
}
