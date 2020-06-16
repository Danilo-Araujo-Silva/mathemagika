package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeomagneticModelData
 *
 * Full name:        System`GeomagneticModelData
 *
 *                   GeomagneticModelData[] returns the current magnetic field data for the current location.
 *                   GeomagneticModelData[locationspec] returns the current magnetic field data for a location.
 *                   GeomagneticModelData[datespec] returns the magnetic field data for the specified time for the current location.
 *                   GeomagneticModelData[locationspec, datespec] returns the magnetic field data for the specified time and location.
 * Usage:            GeomagneticModelData[locationspec, datespec, component] returns the component of the magnetic field for the specified time and location.
 *
 *                   GeoZoomLevel -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeomagneticModelData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeomagneticModelData.html
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
fun geomagneticModelData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeomagneticModelData", arguments.toMutableList(), options)
}
