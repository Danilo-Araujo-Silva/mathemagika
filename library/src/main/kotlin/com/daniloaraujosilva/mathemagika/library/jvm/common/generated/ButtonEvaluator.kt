package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ButtonEvaluator
 * 
 * Full name:        System`ButtonEvaluator
 * 
 * Usage:            ButtonEvaluator is an option for the low-level function ButtonBox that specifies where the expression constructed from ButtonFunction should be sent for evaluation. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ButtonEvaluator
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonEvaluator.html
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
fun buttonEvaluator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonEvaluator", arguments.toMutableList(), options)
}
