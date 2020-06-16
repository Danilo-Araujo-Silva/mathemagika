package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultDuplicateCellStyle
 *
 * Full name:        System`DefaultDuplicateCellStyle
 *
 * Usage:            DefaultDuplicateCellStyle is a notebook option that specifies the default style to use for cells created by automatic duplication of other cells in the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultDuplicateCellStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultDuplicateCellStyle.html
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
fun defaultDuplicateCellStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultDuplicateCellStyle", arguments.toMutableList(), options)
}
