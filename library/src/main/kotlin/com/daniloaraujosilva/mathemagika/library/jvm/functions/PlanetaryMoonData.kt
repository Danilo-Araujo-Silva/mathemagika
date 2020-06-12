package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlanetaryMoonData
 *
 * Full name:        System`PlanetaryMoonData
 *
 *                   PlanetaryMoonData[entity, property] gives the value of the specified property for the moon entity of a planet or minor planet.
 *                   PlanetaryMoonData[{entity , entity , …}, property] gives a list of property values for the specified moon entities.
 *                                            1        2
 * Usage:            PlanetaryMoonData[entity, property, annotation] gives the specified annotation associated with the property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlanetaryMoonData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlanetaryMoonData.html
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
fun planetaryMoonData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlanetaryMoonData", arguments.toMutableList(), options)
}
