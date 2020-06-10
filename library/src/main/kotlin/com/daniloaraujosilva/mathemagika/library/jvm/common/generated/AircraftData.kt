package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AircraftData
 * 
 * Full name:        System`AircraftData
 * 
 *                   AircraftData[entity, property] gives the value of the specified property for the aircraft entity.
 *                   AircraftData[{entity , entity , …}, property] gives a list of property values for the specified aircraft entities.
 *                                       1        2
 * Usage:            AircraftData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AircraftData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AircraftData.html
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
fun aircraftData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AircraftData", arguments.toMutableList(), options)
}
