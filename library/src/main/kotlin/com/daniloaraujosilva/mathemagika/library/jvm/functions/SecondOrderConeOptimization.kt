package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SecondOrderConeOptimization
 *
 * Full name:        System`SecondOrderConeOptimization
 *
 *                   SecondOrderConeOptimization[f, cons, vars] finds values of variables vars that minimize the quadratic objective f subject to second-order cone and/or linear constraints cons.
 *                   SecondOrderConeOptimization[c, {{a , b , α , β }, …, {a , b , α , β }}] finds a vector x that minimizes c . x subject to the constraints  a  . x + b   ≤ α  . x + β .
 *                                                     1   1   1   1        k   k   k   k                                                                        i        i      i        i
 *                   SecondOrderConeOptimization[c, …, {dom , dom , …}] takes x  to be in the domain dom , where dom  is Integers or Reals.
 *                                                         1     2             i                        i           i
 * Usage:            SecondOrderConeOptimization[…, "prop"] specifies what solution property "prop" should be returned.
 *
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SecondOrderConeOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/SecondOrderConeOptimization.html
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
fun secondOrderConeOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SecondOrderConeOptimization", arguments.toMutableList(), options)
}
