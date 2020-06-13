package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MinLimit
 *
 * Full name:        System`MinLimit
 *
 *                                    *
 *                   MinLimit[f, x  x ] gives the min limit        f (x).
 *                                                                 *
 *                                                            x  x
 *                                      *           *
 *                   MinLimit[f, {x   x , …, x   x }] gives the nested min limit        ⋯        f  (x , …, x ).
 *                                 1    1      n    n                                    *         *       1      n
 *                                                                                 x   x    x   x
 *                                                                                  1    1    n    n
 *                                               *      *
 *                   MinLimit[f, {x , …, x }  {x , …, x }] gives the multivariate min limit                          f  (x , …, x ).
 *                                 1      n      1      n                                                    *      *        1      n
 *                                                                                           {x , …, x }  {x , …, x }
 * Usage:                                                                                      1      n      1      n
 *
 *                   Analytic -> False
 *                   Assumptions :> $Assumptions
 *                   Direction -> Reals
 *                   GenerateConditions -> Automatic
 *                   Method -> Automatic
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinLimit.html
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
fun minLimit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinLimit", arguments.toMutableList(), options)
}
