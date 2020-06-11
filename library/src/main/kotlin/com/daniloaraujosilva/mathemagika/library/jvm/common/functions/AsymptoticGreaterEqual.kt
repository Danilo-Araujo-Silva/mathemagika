package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticGreaterEqual
 *
 * Full name:        System`AsymptoticGreaterEqual
 *
 *                                                     *                                                             *
 *                   AsymptoticGreaterEqual[f, g, x  x ] gives conditions for f(x) ⪰ g(x) or f(x) ∈ Ω(g(x)) as x  x .
 *                                                                *      *                                                                                                         *      *
 *                   AsymptoticGreaterEqual[f, g, {x , …, x }  {x , …, x }] gives conditions for f(x , …, x ) ⪰ g(x , …, x ) or f(x , …, x ) ∈ Ω(g(x , …, x )) as {x , …, x }  {x , …, x }.
 * Usage:                                           1      n      1      n                           1      n       1      n        1      n         1      n        1      n      1      n
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
 *                   local: paclet:ref/AsymptoticGreaterEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticGreaterEqual.html
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
fun asymptoticGreaterEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticGreaterEqual", arguments.toMutableList(), options)
}
