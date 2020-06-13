package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeogravityModelData
 *
 * Full name:        System`GeogravityModelData
 *
 *                   GeogravityModelData[] returns the gravitational field data for the current location.
 *                   GeogravityModelData[locationspec] returns the gravitational field data for a location.
 * Usage:            GeogravityModelData[locationspec, component] returns the component of the gravitational field.
 *
 *                   GeoZoomLevel -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeogravityModelData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeogravityModelData.html
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
fun geogravityModelData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeogravityModelData", arguments.toMutableList(), options)
}
