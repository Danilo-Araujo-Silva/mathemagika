package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultInlineFormatType
 *
 * Full name:        System`DefaultInlineFormatType
 *
 * Usage:            DefaultInlineFormatType is an option for cells that specifies the format used for displaying expressions in a newly created inline cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultInlineFormatType
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultInlineFormatType.html
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
fun defaultInlineFormatType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultInlineFormatType", arguments.toMutableList(), options)
}
