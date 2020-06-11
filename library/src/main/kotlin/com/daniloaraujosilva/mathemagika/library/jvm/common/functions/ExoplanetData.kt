package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExoplanetData
 *
 * Full name:        System`ExoplanetData
 *
 *                   ExoplanetData[entity, property] gives the value of the specified property for the exoplanet entity.
 *                   ExoplanetData[{entity , entity , …}, property] gives a list of property values for the specified exoplanet entities.
 *                                        1        2
 * Usage:            ExoplanetData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExoplanetData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExoplanetData.html
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
fun exoplanetData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExoplanetData", arguments.toMutableList(), options)
}
