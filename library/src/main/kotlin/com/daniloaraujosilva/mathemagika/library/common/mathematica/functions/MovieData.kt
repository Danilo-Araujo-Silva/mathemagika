package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MovieData
 *
 * Full name:        System`MovieData
 *
 *                   MovieData[entity, property] gives the value of the specified property for the movie entity.
 *                   MovieData[{entity , entity , …}, property] gives a list of property values for the specified movie entities.
 *                                    1        2
 * Usage:            MovieData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MovieData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MovieData.html
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
fun movieData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MovieData", arguments.toMutableList(), options)
}
