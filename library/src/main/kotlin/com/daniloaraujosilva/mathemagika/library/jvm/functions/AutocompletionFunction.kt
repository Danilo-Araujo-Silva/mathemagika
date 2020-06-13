package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AutocompletionFunction
 *
 * Full name:        System`AutocompletionFunction
 *
 * Usage:            AutocompletionFunction[…] represents a function to be applied to a string to generate possible completions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AutocompletionFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutocompletionFunction.html
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
fun autocompletionFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutocompletionFunction", arguments.toMutableList(), options)
}
