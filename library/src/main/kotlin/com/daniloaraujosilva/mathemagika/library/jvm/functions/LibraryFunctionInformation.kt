package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryFunctionInformation
 *
 * Full name:        System`LibraryFunctionInformation
 *
 * Usage:            LibraryFunctionInformation[fun] returns information about a LibraryFunction.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LibraryFunctionInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryFunctionInformation.html
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
fun libraryFunctionInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryFunctionInformation", arguments.toMutableList(), options)
}
