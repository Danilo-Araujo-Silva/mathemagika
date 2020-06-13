package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Delimiter
 *
 * Full name:        System`Delimiter
 *
 * Usage:            Delimiter represents a delimiter to be displayed in objects such as PopupMenu, Manipulate, and FormObject.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Delimiter
 * Documentation:    web: http://reference.wolfram.com/language/ref/Delimiter.html
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
fun delimiter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Delimiter", arguments.toMutableList(), options)
}
