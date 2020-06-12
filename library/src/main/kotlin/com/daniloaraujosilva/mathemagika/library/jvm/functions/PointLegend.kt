package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PointLegend
 *
 * Full name:        System`PointLegend
 *
 *                   PointLegend[{col , …}, {lbl , …}] generates a legend that associates points of colors col  with labels lbl .
 *                                   1          1                                                             i                i
 *                   PointLegend[{col , …}, Automatic] generates a legend with placeholder labels for the colors col .
 *                                   1                                                                              i
 *                   PointLegend[{lbl , …}] represents a legend with inherited colors within visualization functions.
 * Usage:                            1
 *
 *                   Joined -> False
 *                   LabelStyle -> Automatic
 *                   LegendFunction -> Identity
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
 *                   local: paclet:ref/PointLegend
 * Documentation:    web: http://reference.wolfram.com/language/ref/PointLegend.html
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
fun pointLegend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PointLegend", arguments.toMutableList(), options)
}
