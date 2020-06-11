package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoLabels
 *
 * Full name:        System`GeoLabels
 *
 * Usage:            GeoLabels is an option for GeoListPlot and GeoRegionValuePlot that specifies whether and how to add labels to the locations in the first argument.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoLabels
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoLabels.html
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
fun geoLabels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoLabels", arguments.toMutableList(), options)
}
