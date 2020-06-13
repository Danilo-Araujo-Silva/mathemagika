package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LineLegend
 *
 * Full name:        System`LineLegend
 *
 *                   LineLegend[{col , …}, {lbl , …}] generates a legend that associates color col  with label lbl .
 *                                  1          1                                                  i               i
 *                   LineLegend[{col , …}, Automatic] generates a legend with placeholder labels for the colors col .
 *                                  1                                                                              i
 *                   LineLegend[{lbl , …}] represents a legend with inherited colors within visualization functions.
 * Usage:                           1
 *
 *                   Joined -> True
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
 *                   local: paclet:ref/LineLegend
 * Documentation:    web: http://reference.wolfram.com/language/ref/LineLegend.html
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
fun lineLegend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LineLegend", arguments.toMutableList(), options)
}
