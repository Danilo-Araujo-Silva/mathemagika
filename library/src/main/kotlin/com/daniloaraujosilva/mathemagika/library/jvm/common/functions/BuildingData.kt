package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BuildingData
 *
 * Full name:        System`BuildingData
 *
 *                   BuildingData[entity, property] gives the value of the specified property for the building entity.
 *                   BuildingData[{entity , entity , …}, property] gives a list of property values for the specified building entities.
 *                                       1        2
 * Usage:            BuildingData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BuildingData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BuildingData.html
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
fun buildingData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BuildingData", arguments.toMutableList(), options)
}
