package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryFunctionLoad
 *
 * Full name:        System`LibraryFunctionLoad
 *
 * Usage:            LibraryFunctionLoad[lib, fun, argtype, rettype] loads Wolfram Library lib and makes the library function fun available in the Wolfram Language.
 *
 * Options:          AutomaticDelete -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LibraryFunctionLoad
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryFunctionLoad.html
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
fun libraryFunctionLoad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryFunctionLoad", arguments.toMutableList(), options)
}
