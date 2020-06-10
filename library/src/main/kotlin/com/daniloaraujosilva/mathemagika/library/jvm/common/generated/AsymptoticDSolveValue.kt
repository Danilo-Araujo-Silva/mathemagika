package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AsymptoticDSolveValue
 * 
 * Full name:        System`AsymptoticDSolveValue
 * 
 *                   AsymptoticDSolveValue[eqn, f, x  x ] computes an asymptotic approximation to the differential equation eqn for f[x] centered at x .
 *                                                      0                                                                                              0
 *                   AsymptoticDSolveValue[{eqn , eqn , …}, {f , f , …}, x  x ] computes an asymptotic approximation to a system of differential equations.
 *                                             1     2        1   2           0
 *                   AsymptoticDSolveValue[eqn, f, x, ϵ  ϵ ] computes an asymptotic approximation of f[x, ϵ] for the parameter ϵ centered at ϵ .
 *                                                         0                                                                                   0
 *                   AsymptoticDSolveValue[eqn, f, …, {ξ, ξ , n}] computes the asymptotic approximation to order n. 
 * Usage:                                                  0
 * 
 *                   AccuracyGoal -> Automatic
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> C
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   SeriesTermGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AsymptoticDSolveValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticDSolveValue.html
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
fun asymptoticDSolveValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticDSolveValue", arguments.toMutableList(), options)
}
