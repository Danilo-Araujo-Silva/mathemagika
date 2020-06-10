package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AsymptoticEquivalent
 * 
 * Full name:        System`AsymptoticEquivalent
 * 
 *                                                   *                                           *
 *                   AsymptoticEquivalent[f, g, x  x ] gives conditions for f(x) ∼ g(x) as x  x .
 *                                                              *      *                                                                       *      *
 *                   AsymptoticEquivalent[f, g, {x , …, x }  {x , …, x }] gives conditions for f(x , …, x ) ~ g(x , …, x ) as {x , …, x }  {x , …, x }.
 * Usage:                                         1      n      1      n                           1      n       1      n       1      n      1      n
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
 *                   local: paclet:ref/AsymptoticEquivalent
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticEquivalent.html
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
fun asymptoticEquivalent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticEquivalent", arguments.toMutableList(), options)
}
