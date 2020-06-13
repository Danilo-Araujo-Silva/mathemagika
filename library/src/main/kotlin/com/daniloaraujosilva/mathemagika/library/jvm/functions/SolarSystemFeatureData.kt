package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SolarSystemFeatureData
 *
 * Full name:        System`SolarSystemFeatureData
 *
 *                   SolarSystemFeatureData[entity, property] gives the value of the specified property for the solar system feature entity.
 *                   SolarSystemFeatureData[{entity , entity , …}, property] gives a list of property values for the specified feature entities.
 *                                                 1        2
 * Usage:            SolarSystemFeatureData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SolarSystemFeatureData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SolarSystemFeatureData.html
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
fun solarSystemFeatureData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SolarSystemFeatureData", arguments.toMutableList(), options)
}
