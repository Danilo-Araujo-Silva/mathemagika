package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Area
 *
 * Full name:        System`Area
 *
 *                   Area[reg] gives the area of the two-dimensional region reg.
 *                   Area[{x , …, x }, {s, s   , s   }, {t, t   , t   }] gives the area of the parametrized surface whose Cartesian coordinates x  are functions of s and t.
 *                          1      n        min   max        min   max                                                                           i
 *                   Area[{x , …, x }, {s, s   , s   }, {t, t   , t   }, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                   1      n        min   max        min   max                          i
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
 *                   local: paclet:ref/Area
 * Documentation:    web: http://reference.wolfram.com/language/ref/Area.html
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
fun area(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Area", arguments.toMutableList(), options)
}
