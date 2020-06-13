package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HandlerFunctionsKeys
 *
 * Full name:        System`HandlerFunctionsKeys
 *
 * Usage:            HandlerFunctionsKeys is an option for asynchronous operations that specifies the content of associations to which to apply handler functions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HandlerFunctionsKeys
 * Documentation:    web: http://reference.wolfram.com/language/ref/HandlerFunctionsKeys.html
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
fun handlerFunctionsKeys(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HandlerFunctionsKeys", arguments.toMutableList(), options)
}
