package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultNewInlineCellStyle
 *
 * Full name:        System`DefaultNewInlineCellStyle
 *
 * Usage:            DefaultNewInlineCellStyle is an option for cells that specifies the default style to use for new inline cells created in the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultNewInlineCellStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultNewInlineCellStyle.html
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
fun defaultNewInlineCellStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultNewInlineCellStyle", arguments.toMutableList(), options)
}
