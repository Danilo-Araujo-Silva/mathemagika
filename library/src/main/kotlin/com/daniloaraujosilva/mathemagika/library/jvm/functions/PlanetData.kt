package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PlanetData
 *
 * Full name:        System`PlanetData
 *
 *                   PlanetData[entity, property] gives the value of the specified property for the planet entity.
 *                   PlanetData[{entity , entity , …}, property] gives a list of property values for the specified planet entities.
 *                                     1        2
 * Usage:            PlanetData[entity, property, annotation] gives the specified annotation associated with the property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlanetData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlanetData.html
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
fun planetData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlanetData", arguments.toMutableList(), options)
}
