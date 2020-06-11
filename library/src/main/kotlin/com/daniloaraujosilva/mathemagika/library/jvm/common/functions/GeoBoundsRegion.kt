package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoBoundsRegion
 *
 * Full name:        System`GeoBoundsRegion
 *
 *                   GeoBoundsRegion[{{lat   , lat   }, {lon   , lon   }}] is a two-dimensional GeoGraphics primitive that represents a geo region bounded by parallels lat   , lat    and meridians lon   , lon    on the surface of the Earth.
 *                                        min     max       min     max                                                                                                    min     max                  min     max
 *                   GeoBoundsRegion[g] represents the latitude-longitude bounding box of the geo region g.
 * Usage:            GeoBoundsRegion[g, δ] pads the ranges of latitudes and longitudes by ± δ.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoBoundsRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoBoundsRegion.html
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
fun geoBoundsRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoBoundsRegion", arguments.toMutableList(), options)
}
