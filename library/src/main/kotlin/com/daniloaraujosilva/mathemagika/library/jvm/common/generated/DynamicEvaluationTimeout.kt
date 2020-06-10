package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DynamicEvaluationTimeout
 * 
 * Full name:        System`DynamicEvaluationTimeout
 * 
 * Usage:            DynamicEvaluationTimeout is an option for displayed objects, cells, and notebooks that specifies the timeout in seconds for any Dynamic computations they contain.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DynamicEvaluationTimeout
 * Documentation:    web: http://reference.wolfram.com/language/ref/DynamicEvaluationTimeout.html
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
fun dynamicEvaluationTimeout(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicEvaluationTimeout", arguments.toMutableList(), options)
}
