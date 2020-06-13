package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Save
 *
 * Full name:        System`Save
 *
 *                   Save["filename", symbol] appends definitions associated with the specified symbol to a file.
 *                   Save["filename", "patt"] appends definitions associated with all symbols whose names match the string pattern "patt".
 *                   Save["filename", "context`"] appends definitions associated with all symbols in the specified context.
 *                   Save["filename", {object , object , …}] appends definitions associated with several objects.
 * Usage:                                    1        2
 *
 * Options:          None
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Save
 * Documentation:    web: http://reference.wolfram.com/language/ref/Save.html
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
fun save(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Save", arguments.toMutableList(), options)
}
