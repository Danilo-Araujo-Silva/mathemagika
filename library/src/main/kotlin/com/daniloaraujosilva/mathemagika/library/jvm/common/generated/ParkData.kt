package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParkData
 * 
 * Full name:        System`ParkData
 * 
 *                   ParkData[entity, property] gives the value of the specified property for the park entity.
 *                   ParkData[{entity , entity , …}, property] gives a list of property values for the specified park entities.
 *                                   1        2
 * Usage:            ParkData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ParkData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParkData.html
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
fun parkData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParkData", arguments.toMutableList(), options)
}
