package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SemidefiniteOptimization
 *
 * Full name:        System`SemidefiniteOptimization
 *
 *                   SemidefiniteOptimization[f, cons, vars] finds values of variables vars that minimize the linear objective f subject to semidefinite constraints cons.
 *                                                                                                                                                                                                                                  n
 *                   SemidefiniteOptimization[c, {a , a , …, a }] finds a vector x that minimizes the quantity c . x subject to the linear matrix inequality constraint RowBox[{a  + a  x  + … + a  x , SubscriptBox[⪰, TooltipBox[ , {"SemidefiniteCone", n}]], 0}].
 *                                                 0   1      k                                                                                                                  0    1  1        k  k                              +
 * Usage:            SemidefiniteOptimization[…, "prop"] specifies what solution property "prop" should be returned.
 *
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SemidefiniteOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/SemidefiniteOptimization.html
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
fun semidefiniteOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SemidefiniteOptimization", arguments.toMutableList(), options)
}
