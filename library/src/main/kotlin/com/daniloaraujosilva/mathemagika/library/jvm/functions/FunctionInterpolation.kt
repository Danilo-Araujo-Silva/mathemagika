package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionInterpolation
 *
 * Full name:        System`FunctionInterpolation
 *
 *                   FunctionInterpolation[expr, {x, x   , x   }] evaluates expr with x running from x    to x    and constructs an InterpolatingFunction object which represents an approximate function corresponding to the result.
 *                                                    min   max                                       min     max
 *                   FunctionInterpolation[expr, {x, x   , x   }, {y, y   , y   }, …] constructs an InterpolatingFunction object with several arguments.
 * Usage:                                             min   max        min   max
 *
 *                   AccuracyGoal -> Automatic
 *                   InterpolationOrder -> 3
 *                   InterpolationPoints -> 11
 *                   InterpolationPrecision -> Automatic
 *                   MaxRecursion -> 6
 * Options:          PrecisionGoal -> Automatic
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FunctionInterpolation
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionInterpolation.html
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
fun functionInterpolation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionInterpolation", arguments.toMutableList(), options)
}
