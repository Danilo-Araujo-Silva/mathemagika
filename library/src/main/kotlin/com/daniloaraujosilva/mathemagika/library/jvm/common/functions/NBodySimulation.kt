package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NBodySimulation
 *
 * Full name:        System`NBodySimulation
 *
 *                   NBodySimulation[law, {state , …, state }, t] generates a simulation of the motion of a system of n bodies with initial states state , governed by the specified potential or force law, over a length of time t.
 *                                              1          n                                                                                            i
 *                   NBodySimulation[law, <| body   state , …, body   state  |>, t] generates a simulation of the motion of a system of n bodies with names body .
 * Usage:                                        1        1         n        n                                                                                    i
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
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NBodySimulation
 * Documentation:    web: http://reference.wolfram.com/language/ref/NBodySimulation.html
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
fun nBodySimulation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NBodySimulation", arguments.toMutableList(), options)
}
