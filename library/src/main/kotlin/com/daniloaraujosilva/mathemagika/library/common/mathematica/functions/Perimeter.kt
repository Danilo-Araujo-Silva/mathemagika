package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Perimeter
 *
 * Full name:        System`Perimeter
 *
 *                   Perimeter[reg] gives the perimeter of the two-dimensional region reg.
 *                   Perimeter[{x , x }, {s, s   , s   }, {t, t   , t   }] gives the perimeter of the parametrized region whose Cartesian coordinates x  are functions of s and t.
 *                               1   2        min   max        min   max                                                                               i
 *                   Perimeter[{x , x }, {s, s   , s   }, {t, t   , t   }, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                        1   2        min   max        min   max                          i
 *
 *                   AccuracyGoal -> Infinity
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Perimeter
 * Documentation:    web: http://reference.wolfram.com/language/ref/Perimeter.html
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
fun perimeter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Perimeter", arguments.toMutableList(), options)
}
