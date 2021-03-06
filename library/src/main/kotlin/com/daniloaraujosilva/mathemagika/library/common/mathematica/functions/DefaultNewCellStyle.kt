package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultNewCellStyle
 *
 * Full name:        System`DefaultNewCellStyle
 *
 * Usage:            DefaultNewCellStyle is a notebook option which specifies the default style to use for new cells created in the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultNewCellStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultNewCellStyle.html
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
fun defaultNewCellStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultNewCellStyle", arguments.toMutableList(), options)
}
