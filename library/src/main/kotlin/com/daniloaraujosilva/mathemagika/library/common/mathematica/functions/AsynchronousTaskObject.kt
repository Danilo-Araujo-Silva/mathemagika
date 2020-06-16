package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AsynchronousTaskObject
 *
 * Full name:        System`AsynchronousTaskObject
 *
 * Usage:            AsynchronousTaskObject["name", id, sessionid] is an object that represents asynchronous evaluations from a particular asynchronous task.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AsynchronousTaskObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsynchronousTaskObject.html
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
fun asynchronousTaskObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsynchronousTaskObject", arguments.toMutableList(), options)
}
