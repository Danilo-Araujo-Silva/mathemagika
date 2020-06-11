package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveOutputStreamMethod
 *
 * Full name:        System`RemoveOutputStreamMethod
 *
 * Usage:            RemoveOutputStreamMethod["name"] removes a custom output stream method.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoveOutputStreamMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveOutputStreamMethod.html
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
fun removeOutputStreamMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveOutputStreamMethod", arguments.toMutableList(), options)
}
