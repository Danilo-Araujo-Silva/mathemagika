package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StarData
 *
 * Full name:        System`StarData
 *
 *                   StarData[entity, property] gives the value of the specified property for the star entity.
 *                   StarData[{entity , entity , …}, property] gives a list of property values for the specified star entities.
 *                                   1        2
 * Usage:            StarData[entity, property, annotation] gives the specified annotation associated with the property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StarData
 * Documentation:    web: http://reference.wolfram.com/language/ref/StarData.html
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
fun starData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StarData", arguments.toMutableList(), options)
}
