package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CodeAssistOptions
 *
 * Full name:        System`CodeAssistOptions
 *
 * Usage:            CodeAssistOptions is an option for cells that specifies settings for controlling code input assistance features, including autocompletion, function template insertion, and mouseover behaviors for code.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CodeAssistOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CodeAssistOptions.html
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
fun codeAssistOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CodeAssistOptions", arguments.toMutableList(), options)
}
