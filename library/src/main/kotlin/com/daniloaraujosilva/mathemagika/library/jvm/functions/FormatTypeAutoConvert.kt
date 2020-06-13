package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FormatTypeAutoConvert
 *
 * Full name:        System`FormatTypeAutoConvert
 *
 * Usage:            FormatTypeAutoConvert is an option for cells that specifies whether the contents of a cell are automatically converted into a different format when the style of that cell is changed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FormatTypeAutoConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormatTypeAutoConvert.html
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
fun formatTypeAutoConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormatTypeAutoConvert", arguments.toMutableList(), options)
}
