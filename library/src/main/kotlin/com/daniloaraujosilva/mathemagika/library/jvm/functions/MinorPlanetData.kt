package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MinorPlanetData
 *
 * Full name:        System`MinorPlanetData
 *
 *                   MinorPlanetData[entity, property] gives the value of the specified property for the minor planet entity.
 *                   MinorPlanetData[{entity , entity , …}, property] gives a list of property values for the specified minor planet entities.
 *                                          1        2
 * Usage:            MinorPlanetData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinorPlanetData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinorPlanetData.html
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
fun minorPlanetData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinorPlanetData", arguments.toMutableList(), options)
}
