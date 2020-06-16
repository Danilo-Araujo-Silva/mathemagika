package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NeighborhoodData
 *
 * Full name:        System`NeighborhoodData
 *
 *                   NeighborhoodData[entity, property] gives the value of the specified property for the neighborhood entity.
 *                   NeighborhoodData[{entity , entity , …}, property] gives a list of property values for the specified neighborhood entities.
 *                                           1        2
 * Usage:            NeighborhoodData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NeighborhoodData
 * Documentation:    web: http://reference.wolfram.com/language/ref/NeighborhoodData.html
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
fun neighborhoodData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NeighborhoodData", arguments.toMutableList(), options)
}
