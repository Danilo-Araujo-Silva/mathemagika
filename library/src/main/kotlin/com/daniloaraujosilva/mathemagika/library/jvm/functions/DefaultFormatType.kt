package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultFormatType
 *
 * Full name:        System`DefaultFormatType
 *
 * Usage:            DefaultFormatType is an option for cells that specifies the format used for displaying expressions in a newly created cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultFormatType
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultFormatType.html
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
fun defaultFormatType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultFormatType", arguments.toMutableList(), options)
}
