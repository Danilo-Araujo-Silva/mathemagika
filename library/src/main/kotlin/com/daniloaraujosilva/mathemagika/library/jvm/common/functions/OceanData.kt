package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OceanData
 *
 * Full name:        System`OceanData
 *
 *                   OceanData[entity, property] gives the value of the specified property for the ocean entity.
 *                   OceanData[{entity , entity , …}, property] gives a list of property values for the specified ocean entities.
 *                                    1        2
 * Usage:            OceanData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OceanData
 * Documentation:    web: http://reference.wolfram.com/language/ref/OceanData.html
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
fun oceanData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OceanData", arguments.toMutableList(), options)
}
