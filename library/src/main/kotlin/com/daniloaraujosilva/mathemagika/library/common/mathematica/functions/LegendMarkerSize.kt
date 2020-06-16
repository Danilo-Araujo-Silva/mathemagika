package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LegendMarkerSize
 *
 * Full name:        System`LegendMarkerSize
 *
 * Usage:            LegendMarkerSize is an option for legends such as PointLegend that specifies the size of marker regions for each element.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LegendMarkerSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/LegendMarkerSize.html
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
fun legendMarkerSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LegendMarkerSize", arguments.toMutableList(), options)
}
