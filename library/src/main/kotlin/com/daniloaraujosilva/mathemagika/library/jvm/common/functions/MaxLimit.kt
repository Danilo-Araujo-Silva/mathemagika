package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxLimit
 *
 * Full name:        System`MaxLimit
 *
 *                                    *
 *                   MaxLimit[f, x  x ] gives the max limit        f (x).
 *                                                                 *
 *                                                            x  x
 *                                      *           *
 *                   MaxLimit[f, {x   x , …, x   x }] gives the nested max limit        ⋯        f  (x , …, x ).
 *                                 1    1      n    n                                    *         *       1      n
 *                                                                                 x   x    x   x
 *                                                                                  1    1    n    n
 *                                               *      *
 *                   MaxLimit[f, {x , …, x }  {x , …, x }] gives the multivariate max limit                          f  (x , …, x ).
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
 *                   local: paclet:ref/MaxLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxLimit.html
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
fun maxLimit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxLimit", arguments.toMutableList(), options)
}
