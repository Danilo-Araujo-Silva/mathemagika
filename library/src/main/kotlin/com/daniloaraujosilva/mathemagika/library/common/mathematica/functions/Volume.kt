package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Volume
 *
 * Full name:        System`Volume
 *
 *                   Volume[reg] gives the volume of the three-dimensional region reg.
 *                   Volume[{x , …, x }, {s, s   , s   }, {t, t   , t   }, {u, u   , u   }] gives the volume of the parametrized region whose Cartesian coordinates x  are functions of s, t, u.
 *                            1      n        min   max        min   max        min   max                                                                            i
 *                   Volume[{x , …, x }, {s, s   , s   }, {t, t   , t   }, {u, u   , u   }, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                     1      n        min   max        min   max        min   max                          i
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
 *                   local: paclet:ref/Volume
 * Documentation:    web: http://reference.wolfram.com/language/ref/Volume.html
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
fun volume(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Volume", arguments.toMutableList(), options)
}
