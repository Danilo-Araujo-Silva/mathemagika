package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EvaluationMonitor
 * 
 * Full name:        System`EvaluationMonitor
 * 
 * Usage:            EvaluationMonitor is an option for various numerical computation and plotting functions that gives an expression to evaluate whenever functions derived from the input are evaluated numerically. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/EvaluationMonitor
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationMonitor.html
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
fun evaluationMonitor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationMonitor", arguments.toMutableList(), options)
}
