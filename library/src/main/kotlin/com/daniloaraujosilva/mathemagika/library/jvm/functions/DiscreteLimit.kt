package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteLimit
 *
 * Full name:        System`DiscreteLimit
 *
 *                   DiscreteLimit[f, k  ∞] gives the limit       f (k) for the sequence f as k tends to infinity over the integers.
 *                                                            k  ∞
 *                                           *           *
 *                   DiscreteLimit[f, {k   k , …, k   k }] gives the nested limit        ⋯        f (k , …, k ) over the integers.
 *                                      1    1      n    n                                *         *     1      n
 *                                                                                  k   k    k   k
 *                                                                                   1    1    n    n
 *                                                    *      *
 *                   DiscreteLimit[f, {k , …, k }  {k , …, k }] gives the multivariate limit                          f (k , …, k ) over the integers.
 *                                      1      n      1      n                                                *      *      1      n
 *                                                                                            {k , …, k }  {k , …, k }
 * Usage:                                                                                       1      n      1      n
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
 *                   local: paclet:ref/DiscreteLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteLimit.html
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
fun discreteLimit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteLimit", arguments.toMutableList(), options)
}
