package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextClipboardType
 *
 * Full name:        System`TextClipboardType
 *
 * Usage:            TextClipboardType is an option for cells that specifies how Edit ▶ Copy treats a cell when converting it for the system's textual clipboard.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TextClipboardType
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextClipboardType.html
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
fun textClipboardType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextClipboardType", arguments.toMutableList(), options)
}
