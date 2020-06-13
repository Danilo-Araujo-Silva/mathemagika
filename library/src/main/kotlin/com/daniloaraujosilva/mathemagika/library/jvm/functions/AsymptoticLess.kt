package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticLess
 *
 * Full name:        System`AsymptoticLess
 *
 *                                             *                                                             *
 *                   AsymptoticLess[f, g, x  x ] gives conditions for f(x) ≺ g(x) or f(x) ∈ o(g(x)) as x  x .
 *                                                        *      *                                                                                                         *      *
 *                   AsymptoticLess[f, g, {x , …, x }  {x , …, x }] gives conditions for f(x , …, x ) ≺ g(x , …, x ) or f(x , …, x ) ∈ o(g(x , …, x )) as {x , …, x }  {x , …, x }.
 * Usage:                                   1      n      1      n                           1      n       1      n        1      n         1      n        1      n      1      n
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
 *                   local: paclet:ref/AsymptoticLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticLess.html
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
fun asymptoticLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticLess", arguments.toMutableList(), options)
}
