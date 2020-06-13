package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImportString
 *
 * Full name:        System`ImportString
 *
 *                   ImportString["data", "format"] imports data in the specified format from a string.
 *                   ImportString["data", elements] imports the specified elements.
 * Usage:            ImportString["data"] attempts to determine the format of the string from its contents.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImportString
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImportString.html
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
fun importString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImportString", arguments.toMutableList(), options)
}
