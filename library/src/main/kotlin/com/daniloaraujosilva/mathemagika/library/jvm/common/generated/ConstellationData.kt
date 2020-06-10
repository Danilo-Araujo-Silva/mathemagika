package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ConstellationData
 * 
 * Full name:        System`ConstellationData
 * 
 *                   ConstellationData[entity, property] gives the value of the specified property for the constellation entity.
 *                   ConstellationData[{entity , entity , …}, property] gives a list of property values for the specified constellation entities.
 *                                            1        2
 * Usage:            ConstellationData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ConstellationData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConstellationData.html
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
fun constellationData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConstellationData", arguments.toMutableList(), options)
}
