package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LegendAppearance
 *
 * Full name:        System`LegendAppearance
 *
 * Usage:            LegendAppearance is an option for charting functions that specifies the appearance of any legends that are generated.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LegendAppearance
 * Documentation:    web: http://reference.wolfram.com/language/ref/LegendAppearance.html
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
fun legendAppearance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LegendAppearance", arguments.toMutableList(), options)
}
