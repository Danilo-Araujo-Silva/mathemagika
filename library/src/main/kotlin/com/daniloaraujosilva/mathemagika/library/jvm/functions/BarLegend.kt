package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BarLegend
 *
 * Full name:        System`BarLegend
 *
 *                   BarLegend[cf] generates a legend that identifies colors from the color function cf with an automatic range of values.
 *                   BarLegend[{cf, {min, max}}] generates a legend that identifies colors from the color function cf with the range of values between min and max.
 * Usage:            BarLegend[cf, contours] generates a legend that identifies color ranges from the color function cf based on the set of contours contours.
 *
 *                   LabelStyle -> Automatic
 *                   LegendFunction -> None
 *                   LegendLabel -> None
 *                   LegendLayout -> Automatic
 *                   LegendMargins -> Automatic
 *                   LegendMarkers -> None
 *                   LegendMarkerSize -> Automatic
 * Options:          Method -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BarLegend
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarLegend.html
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
fun barLegend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarLegend", arguments.toMutableList(), options)
}
