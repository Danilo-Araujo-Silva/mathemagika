package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Asynchronous
 *
 * Full name:        System`Asynchronous
 *
 * Usage:            Asynchronous is an option for WolframAlpha that determines whether to use the asynchronous features of the Wolfram|Alpha API.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Asynchronous
 * Documentation:    web: http://reference.wolfram.com/language/ref/Asynchronous.html
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
fun asynchronous(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Asynchronous", arguments.toMutableList(), options)
}
