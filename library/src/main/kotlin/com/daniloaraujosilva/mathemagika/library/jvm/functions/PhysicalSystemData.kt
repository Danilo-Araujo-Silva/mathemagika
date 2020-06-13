package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PhysicalSystemData
 *
 * Full name:        System`PhysicalSystemData
 *
 *                   PhysicalSystemData[entity, property] gives the value of the specified property for the physical system entity.
 *                   PhysicalSystemData[{entity , entity , …}, property] gives a list of property values for the specified physical system entities.
 *                                             1        2
 * Usage:            PhysicalSystemData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PhysicalSystemData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PhysicalSystemData.html
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
fun physicalSystemData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PhysicalSystemData", arguments.toMutableList(), options)
}
