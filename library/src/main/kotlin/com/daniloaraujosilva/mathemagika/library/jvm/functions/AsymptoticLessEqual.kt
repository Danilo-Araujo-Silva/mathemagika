package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticLessEqual
 *
 * Full name:        System`AsymptoticLessEqual
 *
 *                                                  *                                                             *
 *                   AsymptoticLessEqual[f, g, x  x ] gives conditions for f(x) ⪯ g(x) or f(x) ∈ O(g(x)) as x  x .
 *                                                             *      *                                                                                                         *      *
 *                   AsymptoticLessEqual[f, g, {x , …, x }  {x , …, x }] gives conditions for f(x , …, x ) ⪯ g(x , …, x ) or f(x , …, x ) ∈ O(g(x , …, x )) as {x , …, x }  {x , …, x }.
 * Usage:                                        1      n      1      n                           1      n       1      n        1      n         1      n        1      n      1      n
 *
 *                   Analytic -> False
 *                   Assumptions :> $Assumptions
 *                   Direction -> Reals
 *                   GenerateConditions -> Automatic
 *                   Method -> Automatic
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AsymptoticLessEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticLessEqual.html
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
fun asymptoticLessEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticLessEqual", arguments.toMutableList(), options)
}
