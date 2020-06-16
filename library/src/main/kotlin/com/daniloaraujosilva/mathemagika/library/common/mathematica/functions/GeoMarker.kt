package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoMarker
 *
 * Full name:        System`GeoMarker
 *
 *                   GeoMarker[] is a GeoGraphics primitive that represents a marker at the current $GeoLocation.
 *                   GeoMarker[loc] is a GeoGraphics primitive that represents a marker at the location loc.
 *                   GeoMarker[{loc , loc , …}] is a GeoGraphics primitive that represents markers at locations loc .
 *                                 1     2                                                                         i
 *                   GeoMarker[loc, marker] is a GeoGraphics primitive that represents a custom marker at the location loc.
 *                   GeoMarker[{loc , loc , …}, marker] is a GeoGraphics primitive that represents custom markers at locations loc .
 * Usage:                          1     2                                                                                        i
 *
 *                   Alignment -> Automatic
 *                   Color -> Automatic
 *                   Rotate -> Automatic
 * Options:          Scale -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoMarker
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoMarker.html
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
fun geoMarker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoMarker", arguments.toMutableList(), options)
}
