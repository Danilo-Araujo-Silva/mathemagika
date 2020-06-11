package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudFunction
 *
 * Full name:        System`CloudFunction
 *
 *                   CloudFunction[fun] represents a pure function that evaluates fun[args] in the cloud.
 *                   CloudFunction[CloudObject[…]] represents a function that applies the contents of the specified cloud object.
 * Usage:            CloudFunction[f, h] wraps the head h around the result of the function before returning it.
 *
 * Options:          IncludeDefinitions -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudFunction.html
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
fun cloudFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudFunction", arguments.toMutableList(), options)
}
