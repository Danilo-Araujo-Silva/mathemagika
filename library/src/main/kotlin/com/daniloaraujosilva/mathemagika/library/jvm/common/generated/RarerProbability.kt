package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RarerProbability
 * 
 * Full name:        System`RarerProbability
 * 
 *                   RarerProbability[dist, example] computes the probability for distribution dist to generate a sample that has a lower or equal PDF than example.
 *                   RarerProbability[dist, {ex , ex , …}] computes the rarer probability for each ex . 
 * Usage:                                      1    2                                                i
 * 
 *                   BatchProcessing -> Automatic
 *                   ComputeUncertainty -> False
 *                   MaxIterations -> Automatic
 *                   OrderingFunction -> LessEqual
 *                   PerformanceGoal -> Automatic
 * Options:          ProcessorCaching -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RarerProbability
 * Documentation:    web: http://reference.wolfram.com/language/ref/RarerProbability.html
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
fun rarerProbability(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RarerProbability", arguments.toMutableList(), options)
}
