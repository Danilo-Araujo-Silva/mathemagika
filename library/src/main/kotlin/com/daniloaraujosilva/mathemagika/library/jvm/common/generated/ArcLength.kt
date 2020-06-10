package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArcLength
 * 
 * Full name:        System`ArcLength
 * 
 *                   ArcLength[reg] gives the length of the one-dimensional region reg.
 *                   ArcLength[{x , …, x }, {t, t   , t   }] gives the length of the parametrized curve whose Cartesian coordinates x  are functions of t.
 *                               1      n        min   max                                                                           i
 *                   ArcLength[{x , …, x }, {t, t   , t   }, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                        1      n        min   max                          i
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
 *                   local: paclet:ref/ArcLength
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcLength.html
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
fun arcLength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcLength", arguments.toMutableList(), options)
}
