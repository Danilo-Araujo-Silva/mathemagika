package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SatelliteData
 *
 * Full name:        System`SatelliteData
 *
 *                   SatelliteData[entity, property] gives the value of the specified property for the satellite entity.
 *                   SatelliteData[{entity , entity , …}, property] gives a list of property values for the specified satellite entities.
 *                                        1        2
 * Usage:            SatelliteData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SatelliteData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SatelliteData.html
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
fun satelliteData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SatelliteData", arguments.toMutableList(), options)
}
