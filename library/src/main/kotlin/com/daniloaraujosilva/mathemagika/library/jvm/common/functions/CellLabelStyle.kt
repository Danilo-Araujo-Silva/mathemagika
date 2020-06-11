package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellLabelStyle
 *
 * Full name:        System`CellLabelStyle
 *
 * Usage:            CellLabelStyle is an option for Cell that specifies the style to use in displaying cell labels marking inputs and outputs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellLabelStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellLabelStyle.html
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
fun cellLabelStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellLabelStyle", arguments.toMutableList(), options)
}
