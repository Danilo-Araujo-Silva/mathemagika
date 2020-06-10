package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NIntegrate
 * 
 * Full name:        System`NIntegrate
 * 
 *                                                                                                   x
 *                                                                                                    max
 *                   NIntegrate[f, {x, x   , x   }] gives a numerical approximation to the integral ∫     f dx. 
 *                                      min   max                                                    x
 *                                                                                                    min
 *                                                                                                                                x        y
 *                                                                                                                                 max      max
 *                   NIntegrate[f, {x, x   , x   }, {y, y   , y   }, …] gives a numerical approximation to the multiple integral ∫     dx ∫     dy … f.
 *                                      min   max        min   max                                                                x        y
 *                                                                                                                                 min      min
 * Usage:            NIntegrate[f, {x, y, …} ∈ reg] integrates over the geometric region reg.
 * 
 *                   AccuracyGoal -> Infinity
 *                   Compiled -> Automatic
 *                   EvaluationMonitor -> None
 *                   Exclusions -> None
 *                   MaxPoints -> Automatic
 *                   MaxRecursion -> Automatic
 *                   Method -> Automatic
 *                   MinRecursion -> 0
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NIntegrate
 * Documentation:    web: http://reference.wolfram.com/language/ref/NIntegrate.html
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
fun nIntegrate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NIntegrate", arguments.toMutableList(), options)
}
