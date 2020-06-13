package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SurvivalDistribution
 *
 * Full name:        System`SurvivalDistribution
 *
 *                   SurvivalDistribution[{e , e , …}] represents a survival distribution with event times e .
 *                                          1   2                                                           i
 *                   SurvivalDistribution[{cw , cw , …}  {e , e , …}] represents a survival distribution where events e  occur with censor weights cw .
 * Usage:                                    1    2         1   2                                                       i                             i
 *
 *                   AccuracyGoal -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurvivalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurvivalDistribution.html
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
fun survivalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurvivalDistribution", arguments.toMutableList(), options)
}
