package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoServer
 *
 * Full name:        System`GeoServer
 *
 * Usage:            GeoServer is an option for GeoGraphics, GeoStyling and GeoImage that specifies the URL address of a geo server and connection parameters to download map tiles and geo elevation data.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoServer
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoServer.html
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
fun geoServer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoServer", arguments.toMutableList(), options)
}
