package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LibraryFunctionError
 * 
 * Full name:        System`LibraryFunctionError
 * 
 * Usage:            LibraryFunctionError[name, code] represents an error returned from a LibraryFunction.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LibraryFunctionError
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryFunctionError.html
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
fun libraryFunctionError(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryFunctionError", arguments.toMutableList(), options)
}
