package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteMaxLimit
 *
 * Full name:        System`DiscreteMaxLimit
 *
 *                   DiscreteMaxLimit[f, k  ∞] gives the max limit       f (k) of the sequence f as k tends to ∞ over the integers.
 *                                                                   k  ∞
 *                                              *           *
 *                   DiscreteMaxLimit[f, {k   k , …, k   k }] gives the nested max limit        ⋯        f (k , …, k ) over the integers.
 *                                         1    1      n    n                                    *         *     1      n
 *                                                                                         k   k    k   k
 *                                                                                          1    1    n    n
 *                                                       *      *
 *                   DiscreteMaxLimit[f, {k , …, k }  {k , …, k }] gives the multivariate max limit                          f (k , …, k ) over the integers.
 *                                         1      n      1      n                                                    *      *      1      n
 *                                                                                                   {k , …, k }  {k , …, k }
 * Usage:                                                                                              1      n      1      n
 *
 *                   Analytic -> False
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   Method -> Automatic
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteMaxLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteMaxLimit.html
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
fun discreteMaxLimit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteMaxLimit", arguments.toMutableList(), options)
}
