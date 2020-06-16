package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoRangePadding
 *
 * Full name:        System`GeoRangePadding
 *
 * Usage:            GeoRangePadding is an option for GeoGraphics that specifies what padding to use when extending beyond the original ranges of latitude and longitude.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoRangePadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoRangePadding.html
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
fun geoRangePadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoRangePadding", arguments.toMutableList(), options)
}
