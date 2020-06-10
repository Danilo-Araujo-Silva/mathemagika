package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IncludeDefinitions
 * 
 * Full name:        System`IncludeDefinitions
 * 
 * Usage:            IncludeDefinitions is an option for cloud and other functions that specifies whether current definitions relevant for the evaluation of an expression should be explicitly included when the expression is deployed. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/IncludeDefinitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeDefinitions.html
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
fun includeDefinitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeDefinitions", arguments.toMutableList(), options)
}
