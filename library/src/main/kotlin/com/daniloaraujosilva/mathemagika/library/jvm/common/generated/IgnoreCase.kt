package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IgnoreCase
 * 
 * Full name:        System`IgnoreCase
 * 
 * Usage:            IgnoreCase is an option for string manipulation and searching functions that specifies whether lowercase and uppercase letters should be treated as equivalent. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/IgnoreCase
 * Documentation:    web: http://reference.wolfram.com/language/ref/IgnoreCase.html
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
fun ignoreCase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IgnoreCase", arguments.toMutableList(), options)
}
