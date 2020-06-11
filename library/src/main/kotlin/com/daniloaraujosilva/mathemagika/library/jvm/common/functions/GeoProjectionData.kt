package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoProjectionData
 *
 * Full name:        System`GeoProjectionData
 *
 *                   GeoProjectionData["projection", "property"] gives the value of the specified property for the specified cartographic projection.
 * Usage:            GeoProjectionData["projection"] gives the complete options for the default form of the specified projection.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoProjectionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoProjectionData.html
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
fun geoProjectionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoProjectionData", arguments.toMutableList(), options)
}
