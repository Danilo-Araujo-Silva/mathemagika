package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlantData
 *
 * Full name:        System`PlantData
 *
 *                   PlantData[entity, property] gives the value of the specified property for the plant entity.
 *                   PlantData[{entity , entity , …}, property] gives a list of property values for the specified plant entities.
 *                                    1        2
 * Usage:            PlantData[entity, property, annotation] gives the specified annotation associated with the property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlantData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlantData.html
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
fun plantData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlantData", arguments.toMutableList(), options)
}
