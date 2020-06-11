package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellBracketOptions
 *
 * Full name:        System`CellBracketOptions
 *
 * Usage:            CellBracketOptions is an option for cells that specifies settings for cell brackets.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellBracketOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellBracketOptions.html
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
fun cellBracketOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellBracketOptions", arguments.toMutableList(), options)
}
