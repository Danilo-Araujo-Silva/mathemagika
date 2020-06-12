package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveInputStreamMethod
 *
 * Full name:        System`RemoveInputStreamMethod
 *
 * Usage:            RemoveInputStreamMethod["name"] removes a custom input stream method.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoveInputStreamMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveInputStreamMethod.html
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
fun removeInputStreamMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveInputStreamMethod", arguments.toMutableList(), options)
}
