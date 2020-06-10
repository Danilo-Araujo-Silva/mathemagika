package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QuadraticOptimization
 * 
 * Full name:        System`QuadraticOptimization
 * 
 *                   QuadraticOptimization[f, cons, vars] finds values of variables vars that minimize the quadratic objective f subject to linear constraints cons.
 *                   QuadraticOptimization[{q, c}, {a, b}] finds a vector x that minimizes the quadratic objective 1/2x . q . x + c . x subject to the linear inequality constraints a . x + b ⪰ 0. 
 *                   QuadraticOptimization[{q, c}, {a, b}, {a  , b  }] includes the linear equality constraints a   . x + b    0.
 *                                                           eq   eq                                             eq        eq
 *                   QuadraticOptimization[{q, c}, …, {dom , dom , …}] takes x  to be in the domain dom , where dom  is Integers or Reals.
 *                                                        1     2             i                        i           i
 * Usage:            QuadraticOptimization[…, "prop"] specifies what solution property "prop" should be returned. 
 * 
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          Tolerance -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QuadraticOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuadraticOptimization.html
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
fun quadraticOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuadraticOptimization", arguments.toMutableList(), options)
}
