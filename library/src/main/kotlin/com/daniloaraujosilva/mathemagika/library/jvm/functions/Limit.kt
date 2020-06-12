package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Limit
 *
 * Full name:        System`Limit
 *
 *                                 *
 *                   Limit[f, x  x ] gives the limit        f (x).
 *                                                          *
 *                                                     x  x
 *                                   *           *
 *                   Limit[f, {x   x , …, x   x }] gives the nested limit        ⋯        f  (x , …, x ).
 *                              1    1      n    n                                *         *       1      n
 *                                                                          x   x    x   x
 *                                                                           1    1    n    n
 *                                            *      *
 *                   Limit[f, {x , …, x }  {x , …, x }] gives the multivariate limit                          f  (x , …, x ).
 *                              1      n      1      n                                                *      *        1      n
 *                                                                                    {x , …, x }  {x , …, x }
 * Usage:                                                                               1      n      1      n
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
 *                   local: paclet:ref/Limit
 * Documentation:    web: http://reference.wolfram.com/language/ref/Limit.html
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
fun limit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Limit", arguments.toMutableList(), options)
}
