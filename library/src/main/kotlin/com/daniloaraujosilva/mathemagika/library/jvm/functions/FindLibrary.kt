package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindLibrary
 *
 * Full name:        System`FindLibrary
 *
 * Usage:            FindLibrary[lib] finds a dynamic library that can be loaded by LibraryFunctionLoad.
 *
 * Options:          None
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindLibrary
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindLibrary.html
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
fun findLibrary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindLibrary", arguments.toMutableList(), options)
}
