package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Series
 *
 * Full name:        System`Series
 *
 *                                                                                                                          n
 *                   Series[f, {x, x , n}] generates a power series expansion for f about the point x = x  to order (x - x ) , where n is an explicit integer.
 *                                  0                                                                    0                0
 *                   Series[f, x  x ] generates the leading term of a power series expansion for f about the point x = x .
 *                                  0                                                                                    0
 *                   Series[f, {x, x , n }, {y, y , n }, …] successively finds series expansions with respect to x, then y, etc.
 * Usage:                           0   x        0   y
 *
 *                   Analytic -> True
 *                   Assumptions :> $Assumptions
 * Options:          SeriesTermGoal -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Series
 * Documentation:    web: http://reference.wolfram.com/language/ref/Series.html
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
fun series(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Series", arguments.toMutableList(), options)
}
