package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NebulaData
 * 
 * Full name:        System`NebulaData
 * 
 *                   NebulaData[entity, property] gives the value of the specified property for the nebula entity.
 *                   NebulaData[{entity , entity , …}, property] gives a list of property values for the specified nebula entities.
 *                                     1        2
 * Usage:            NebulaData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NebulaData
 * Documentation:    web: http://reference.wolfram.com/language/ref/NebulaData.html
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
fun nebulaData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NebulaData", arguments.toMutableList(), options)
}
