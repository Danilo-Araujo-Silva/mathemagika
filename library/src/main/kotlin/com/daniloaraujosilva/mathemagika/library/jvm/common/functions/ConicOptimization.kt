package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConicOptimization
 *
 * Full name:        System`ConicOptimization
 *
 *                   ConicOptimization[f, cons, vars] finds values of variables vars that minimize the linear objective f subject to conic constraints cons.
 * Usage:            ConicOptimization[…, "prop"] specifies what solution property "prop" should be returned.
 *
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConicOptimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConicOptimization.html
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
fun conicOptimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConicOptimization", arguments.toMutableList(), options)
}
