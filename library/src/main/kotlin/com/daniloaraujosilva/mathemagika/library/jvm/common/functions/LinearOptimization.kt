package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LinearOptimization
 *
 * Full name:        System`LinearOptimization
 *
 *                   LinearOptimization[f, cons, vars] finds values of variables vars that minimize the linear objective f subject to linear constraints cons.
 *                   LinearOptimization[c, {a, b}]  finds a real vector x that minimizes the linear objective c . x subject to the linear inequality constraints a . x + b ⪰ 0.
 *                   LinearOptimization[c, {a, b}, {a  , b  }] includes the linear equality constraints a   . x + b    0.
 *                                                   eq   eq                                             eq        eq
 *                   LinearOptimization[c, …, {dom , dom , …}] takes x  to be in the domain dom , where dom  is Integers or Reals.
 *                                                1     2             i                        i           i
 * Usage:            LinearOptimization[…, "prop"] specifies what solution property "prop" should be returned.
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
 *                   local: paclet:ref/LinearOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearOptimization.html
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
fun linearOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearOptimization", arguments.toMutableList(), options)
}
