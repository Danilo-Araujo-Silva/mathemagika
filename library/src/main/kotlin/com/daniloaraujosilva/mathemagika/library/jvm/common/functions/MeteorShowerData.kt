package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeteorShowerData
 *
 * Full name:        System`MeteorShowerData
 *
 *                   MeteorShowerData[entity, property] gives the value of the specified property for the meteor shower entity.
 *                   MeteorShowerData[{entity , entity , …}, property] gives a list of property values for the specified meteor shower entities.
 *                                           1        2
 * Usage:            MeteorShowerData[name, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeteorShowerData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeteorShowerData.html
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
fun meteorShowerData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeteorShowerData", arguments.toMutableList(), options)
}
