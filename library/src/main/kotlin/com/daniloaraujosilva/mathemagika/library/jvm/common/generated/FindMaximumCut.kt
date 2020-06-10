package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindMaximumCut
 * 
 * Full name:        System`FindMaximumCut
 * 
 * Usage:            FindMaximumCut[g] gives the maximum cut of the graph g.
 * 
 *                   EdgeWeight -> Automatic
 * Options:          PerformanceGoal -> Speed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FindMaximumCut
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMaximumCut.html
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
fun findMaximumCut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMaximumCut", arguments.toMutableList(), options)
}
