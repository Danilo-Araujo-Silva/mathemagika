package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryFunctionUnload
 *
 * Full name:        System`LibraryFunctionUnload
 *
 * Usage:            LibraryFunctionUnload[fun] unloads a LibraryFunction so that it cannot be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LibraryFunctionUnload
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryFunctionUnload.html
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
fun libraryFunctionUnload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryFunctionUnload", arguments.toMutableList(), options)
}
