package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MannedSpaceMissionData
 *
 * Full name:        System`MannedSpaceMissionData
 *
 *                   MannedSpaceMissionData[entity, property] gives the value of the specified property for the manned space mission entity.
 *                   MannedSpaceMissionData[{entity , entity , …}, property] gives a list of property values for the specified manned space mission entities.
 *                                                 1        2
 * Usage:            MannedSpaceMissionData[name, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MannedSpaceMissionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MannedSpaceMissionData.html
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
fun mannedSpaceMissionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MannedSpaceMissionData", arguments.toMutableList(), options)
}
