package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EpilogFunction
 *
 * Full name:        System`EpilogFunction
 *
 * Usage:            EpilogFunction is an option for DocumentGenerator allowing arbitrary code to be executed after a document is generated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EpilogFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/EpilogFunction.html
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
fun epilogFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EpilogFunction", arguments.toMutableList(), options)
}
