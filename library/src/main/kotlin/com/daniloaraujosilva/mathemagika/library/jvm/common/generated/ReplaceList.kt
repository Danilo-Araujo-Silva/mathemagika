package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ReplaceList
 * 
 * Full name:        System`ReplaceList
 * 
 *                   ReplaceList[expr, rules] attempts to transform the entire expression expr by applying a rule or list of rules in all possible ways, and returns a list of the results obtained. 
 *                   ReplaceList[expr, rules, n] gives a list of at most n results. 
 * Usage:            ReplaceList[rules] is an operator form of ReplaceList that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ReplaceList
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplaceList.html
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
fun replaceList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplaceList", arguments.toMutableList(), options)
}
