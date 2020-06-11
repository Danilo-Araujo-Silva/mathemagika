package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BroadcastStationData
 *
 * Full name:        System`BroadcastStationData
 *
 *                   BroadcastStationData[entity, property] gives the value of the specified property for the broadcast station entity.
 *                   BroadcastStationData[{entity , entity , …}, property] gives a list of property values for the specified broadcast station entities.
 *                                               1        2
 * Usage:            BroadcastStationData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BroadcastStationData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BroadcastStationData.html
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
fun broadcastStationData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BroadcastStationData", arguments.toMutableList(), options)
}
