package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteMinLimit
 *
 * Full name:        System`DiscreteMinLimit
 *
 *                   DiscreteMinLimit[f, k  ∞] gives the min limit       f (k) of the sequence f as k tends to ∞ over the integers.
 *                                                                   k  ∞
 *                                              *           *
 *                   DiscreteMinLimit[f, {k   k , …, k   k }] gives the nested min limit        ⋯        f (k , …, k ) over the integers.
 *                                         1    1      n    n                                    *         *     1      n
 *                                                                                         k   k    k   k
 *                                                                                          1    1    n    n
 *                                                       *      *
 *                   DiscreteMinLimit[f, {k , …, k }  {k , …, k }] gives the multivariate min limit                          f (k , …, k ) over the integers.
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
 *                   local: paclet:ref/DiscreteMinLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteMinLimit.html
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
fun discreteMinLimit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteMinLimit", arguments.toMutableList(), options)
}
