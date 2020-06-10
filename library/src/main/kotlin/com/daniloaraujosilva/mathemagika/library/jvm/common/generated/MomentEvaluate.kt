package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MomentEvaluate
 * 
 * Full name:        System`MomentEvaluate
 * 
 *                   MomentEvaluate[mexpr, dist] evaluates formal moments in the moment expression mexpr on the distribution dist.
 *                   MomentEvaluate[mexpr, list] evaluates formal moments and formal sample moments in mexpr on the data list. 
 * Usage:            MomentEvaluate[mexpr, dist, list] evaluates formal moments on the distribution dist and formal sample moments on the data list. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MomentEvaluate
 * Documentation:    web: http://reference.wolfram.com/language/ref/MomentEvaluate.html
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
fun momentEvaluate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MomentEvaluate", arguments.toMutableList(), options)
}
