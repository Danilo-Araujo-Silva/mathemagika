package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LinearFractionalOptimization
 * 
 * Full name:        System`LinearFractionalOptimization
 * 
 *                   LinearFractionalOptimization[f, cons, vars] finds values of variables vars that minimize the linear fractional objective f subject to linear constraints cons.
 *                   LinearFractionalOptimization[{α, β, γ, δ}, {a, b}] finds a vector x that minimizes the linear fractional function (α . x + β)/(γ . x + δ) subject to the linear inequality constraints a . x + b ⪰ 0. 
 *                   LinearFractionalOptimization[{α, β, γ, δ}, {a, b}, {a  , b  }] includes the linear equality constraints a   . x + b    0.
 *                                                                        eq   eq                                             eq        eq
 *                   LinearFractionalOptimization[{α, β, γ, δ}, …, {dom , dom , …}] takes x  to be in the domain dom , where dom  is Integers or Reals. 
 *                                                                     1     2             i                        i           i
 * Usage:            LinearFractionalOptimization[…, "prop"] specifies what solution property "prop" should be returned.
 * 
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   Tolerance -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LinearFractionalOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearFractionalOptimization.html
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
fun linearFractionalOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearFractionalOptimization", arguments.toMutableList(), options)
}
