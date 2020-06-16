package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectLibraryCallbackFunction
 *
 * Full name:        System`ConnectLibraryCallbackFunction
 *
 * Usage:            ConnectLibraryCallbackFunction[mname, cf] connects a CompiledFunction cf with the library callback manager with name mname.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConnectLibraryCallbackFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectLibraryCallbackFunction.html
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
fun connectLibraryCallbackFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectLibraryCallbackFunction", arguments.toMutableList(), options)
}
