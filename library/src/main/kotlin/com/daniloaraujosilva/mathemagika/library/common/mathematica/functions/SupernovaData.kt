package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SupernovaData
 *
 * Full name:        System`SupernovaData
 *
 *                   SupernovaData[entity, property] gives the value of the specified property for the supernova entity.
 *                   SupernovaData[{entity , entity , …}, property] gives a list of property values for the specified supernova entities.
 *                                        1        2
 * Usage:            SupernovaData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SupernovaData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SupernovaData.html
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
fun supernovaData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SupernovaData", arguments.toMutableList(), options)
}
