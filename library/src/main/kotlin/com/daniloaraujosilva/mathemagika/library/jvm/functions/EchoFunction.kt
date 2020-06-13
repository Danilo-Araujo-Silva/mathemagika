package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EchoFunction
 *
 * Full name:        System`EchoFunction
 *
 *                   EchoFunction[f][expr] prints f[expr] and returns expr.
 * Usage:            EchoFunction[label, f][expr] prints f[expr], prepending label, and returns expr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EchoFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/EchoFunction.html
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
fun echoFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EchoFunction", arguments.toMutableList(), options)
}
