package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GalaxyData
 *
 * Full name:        System`GalaxyData
 *
 *                   GalaxyData[entity, property] gives the value of the specified property for the galaxy entity.
 *                   GalaxyData[{entity , entity , …}, property] gives a list of property values for the specified galaxy entities.
 *                                     1        2
 * Usage:            GalaxyData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GalaxyData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GalaxyData.html
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
fun galaxyData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GalaxyData", arguments.toMutableList(), options)
}
