package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeometricOptimization
 *
 * Full name:        System`GeometricOptimization
 *
 *                   GeometricOptimization[f, cons, vars] finds positive values of variables vars that minimize the posynomial objective subject to posynomial constraints cons.
 *                                                                                                                                     a    . y + b                                             a    . y + b
 *                                                                                                             y                 k      0j        0j                                    k      ij        ij
 *                   GeometricOptimization[{a , b }, {{a , b }, …}, {a  , b  }] finds the positive vector x =   that minimizes   0                   subject to inequality constraints   i                   ≤ 1, i = 1, …, s and linear equality constraints a    . y + b    = 0.
 *                                           0   0      1   1         eq   eq                                                     ∑                                                        ∑                                                                      eq        eq
 *                                                                                                                              j = 1                                                    j = 1
 * Usage:            GeometricOptimization[…, "prop"]  specifies what solution property "prop" should be returned.
 *
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal -> Quality
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeometricOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeometricOptimization.html
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
fun geometricOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricOptimization", arguments.toMutableList(), options)
}
