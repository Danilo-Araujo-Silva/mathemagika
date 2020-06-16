package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LegendreType
 *
 * Full name:        System`LegendreType
 *
 * Usage:            System`LegendreType
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LegendreType
 * Documentation:    web: http://reference.wolfram.com/language/ref/LegendreType.html
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
fun legendreType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LegendreType", arguments.toMutableList(), options)
}
