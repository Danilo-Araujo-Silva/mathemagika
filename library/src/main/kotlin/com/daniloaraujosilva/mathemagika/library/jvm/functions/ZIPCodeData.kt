package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ZIPCodeData
 *
 * Full name:        System`ZIPCodeData
 *
 *                   ZIPCodeData[entity, property] gives the value of the specified property for the ZIP code entity.
 *                   ZIPCodeData[{entity , entity , …}, property] gives a list of property values for the specified ZIP code entities.
 *                                      1        2
 * Usage:            ZIPCodeData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ZIPCodeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZIPCodeData.html
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
fun zIPCodeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZIPCodeData", arguments.toMutableList(), options)
}
