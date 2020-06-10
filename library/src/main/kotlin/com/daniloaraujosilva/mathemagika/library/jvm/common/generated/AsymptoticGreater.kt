package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AsymptoticGreater
 * 
 * Full name:        System`AsymptoticGreater
 * 
 *                                                *                                                             *
 *                   AsymptoticGreater[f, g, x  x ] gives conditions for f(x) ≻ g(x) or f(x) ∈ ω(g(x)) as x  x .
 *                                                           *      *                                                                                                         *      *
 *                   AsymptoticGreater[f, g, {x , …, x }  {x , …, x }] gives conditions for f(x , …, x ) ≻ g(x , …, x ) or f(x , …, x ) ∈ ω(g(x , …, x )) as {x , …, x }  {x , …, x }.
 * Usage:                                      1      n      1      n                           1      n       1      n        1      n         1      n        1      n      1      n
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
 *                   local: paclet:ref/AsymptoticGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticGreater.html
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
fun asymptoticGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticGreater", arguments.toMutableList(), options)
}
