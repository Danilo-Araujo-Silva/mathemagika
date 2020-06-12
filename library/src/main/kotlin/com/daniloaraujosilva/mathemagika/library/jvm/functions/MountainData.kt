package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MountainData
 *
 * Full name:        System`MountainData
 *
 *                   MountainData[entity, property] gives the value of the specified property for the mountain entity.
 *                   MountainData[{entity , entity , …}, property] gives a list of property values for the specified mountain entities.
 *                                       1        2
 * Usage:            MountainData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MountainData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MountainData.html
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
fun mountainData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MountainData", arguments.toMutableList(), options)
}
