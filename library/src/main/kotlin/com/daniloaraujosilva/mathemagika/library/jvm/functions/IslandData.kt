package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IslandData
 *
 * Full name:        System`IslandData
 *
 *                   IslandData[entity, property] gives the value of the specified property for the island entity.
 *                   IslandData[{entity , entity , …}, property] gives a list of property values for the specified island entities.
 *                                     1        2
 * Usage:            IslandData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IslandData
 * Documentation:    web: http://reference.wolfram.com/language/ref/IslandData.html
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
fun islandData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IslandData", arguments.toMutableList(), options)
}
