package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StabilityMargins
 *
 * Full name:        System`StabilityMargins
 *
 * Usage:            StabilityMargins is an option to frequency response plots such as BodePlot, NyquistPlot, and NicholsPlot that specifies the gain and phase margins to be shown on the plot.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StabilityMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/StabilityMargins.html
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
fun stabilityMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StabilityMargins", arguments.toMutableList(), options)
}
