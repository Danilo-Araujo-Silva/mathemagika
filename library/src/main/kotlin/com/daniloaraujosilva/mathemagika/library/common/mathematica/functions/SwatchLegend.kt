package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SwatchLegend
 *
 * Full name:        System`SwatchLegend
 *
 *                   SwatchLegend[{col , …}, {lbl , …}] generates a legend that associates swatches of colors col  with labels lbl .
 *                                    1          1                                                               i                i
 *                   SwatchLegend[{col , …}, Automatic] generates a legend with placeholder labels for the colors col .
 *                                    1                                                                              i
 *                   SwatchLegend[{lbl , …}] represents a legend with inherited colors within visualization functions.
 * Usage:                             1
 *
 *                   LabelStyle -> Automatic
 *                   LegendFunction -> Identity
 *                   LegendLabel -> None
 *                   LegendLayout -> Automatic
 *                   LegendMargins -> Automatic
 *                   LegendMarkers -> Automatic
 *                   LegendMarkerSize -> Automatic
 * Options:          Method -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SwatchLegend
 * Documentation:    web: http://reference.wolfram.com/language/ref/SwatchLegend.html
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
fun swatchLegend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SwatchLegend", arguments.toMutableList(), options)
}
