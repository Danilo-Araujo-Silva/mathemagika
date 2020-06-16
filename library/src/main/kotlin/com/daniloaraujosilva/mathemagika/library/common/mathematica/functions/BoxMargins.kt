package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BoxMargins
 *
 * Full name:        System`BoxMargins
 *
 * Usage:            BoxMargins is an option for AdjustmentBox objects that specifies the margins to leave around the contents of the box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoxMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoxMargins.html
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
fun boxMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoxMargins", arguments.toMutableList(), options)
}
