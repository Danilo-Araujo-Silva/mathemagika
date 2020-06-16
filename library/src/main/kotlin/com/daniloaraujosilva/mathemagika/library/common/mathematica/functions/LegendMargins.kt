package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LegendMargins
 *
 * Full name:        System`LegendMargins
 *
 * Usage:            LegendMargins is an option for legends that specifies the margins to leave around the legend.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LegendMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/LegendMargins.html
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
fun legendMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LegendMargins", arguments.toMutableList(), options)
}
