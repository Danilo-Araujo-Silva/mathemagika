package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SurfaceArea
 *
 * Full name:        System`SurfaceArea
 *
 *                   SurfaceArea[reg] gives the surface area of the three-dimensional region reg.
 *                   SurfaceArea[{x , …, x }, {s, s   , s    }, {t, t   , t   }, {u, u   , u   }] gives the surface area of the parametrized region whose Cartesian coordinates x  are functions of s, t, u.
 *                                 1      n        min   smax        min   max        min   max                                                                                  i
 *                   SurfaceArea[{x , …, x }, {s, s   , s    }, {t, t   , t   }, {u, u   , u   }, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                          1      n        min   smax        min   max        min   max                          i
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
 *                   local: paclet:ref/SurfaceArea
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurfaceArea.html
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
fun surfaceArea(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurfaceArea", arguments.toMutableList(), options)
}
