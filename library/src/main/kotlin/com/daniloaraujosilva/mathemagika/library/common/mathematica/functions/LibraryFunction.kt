package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryFunction
 *
 * Full name:        System`LibraryFunction
 *
 * Usage:            LibraryFunction[ args] represents a function that has been loaded from a Wolfram Library.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LibraryFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryFunction.html
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
fun libraryFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryFunction", arguments.toMutableList(), options)
}
