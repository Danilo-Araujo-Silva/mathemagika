package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryLoad
 *
 * Full name:        System`LibraryLoad
 *
 * Usage:            LibraryLoad[lib] loads the dynamic library lib into the Wolfram System runtime.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LibraryLoad
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryLoad.html
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
fun libraryLoad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryLoad", arguments.toMutableList(), options)
}
