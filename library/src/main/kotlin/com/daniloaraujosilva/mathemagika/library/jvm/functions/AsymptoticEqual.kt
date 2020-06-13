package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticEqual
 *
 * Full name:        System`AsymptoticEqual
 *
 *                                              *                                                             *
 *                   AsymptoticEqual[f, g, x  x ] gives conditions for f(x) ≍ g(x) or f(x) ∈ Θ(g(x)) as x  x .
 *                                                         *      *                                                                                                         *      *
 *                   AsymptoticEqual[f, g, {x , …, x }  {x , …, x }] gives conditions for f(x , …, x ) ≍ g(x , …, x ) or f(x , …, x ) ∈ Θ(g(x , …, x )) as {x , …, x }  {x , …, x }.
 * Usage:                                    1      n      1      n                           1      n       1      n        1      n         1      n        1      n      1      n
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
 *                   local: paclet:ref/AsymptoticEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticEqual.html
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
fun asymptoticEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticEqual", arguments.toMutableList(), options)
}
