package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryUnload
 *
 * Full name:        System`LibraryUnload
 *
 * Usage:            LibraryUnload[lib] unloads all functions that have been loaded from a Wolfram Library, then it unloads the library.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LibraryUnload
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryUnload.html
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
fun libraryUnload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryUnload", arguments.toMutableList(), options)
}
