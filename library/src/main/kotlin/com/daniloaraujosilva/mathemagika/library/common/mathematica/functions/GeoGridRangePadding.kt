package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoGridRangePadding
 *
 * Full name:        System`GeoGridRangePadding
 *
 * Usage:            GeoGridRangePadding is an option for geographic functions that specifies how much to extend the projected coordinate ranges determined by GeoGridRange.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoGridRangePadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoGridRangePadding.html
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
fun geoGridRangePadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoGridRangePadding", arguments.toMutableList(), options)
}
