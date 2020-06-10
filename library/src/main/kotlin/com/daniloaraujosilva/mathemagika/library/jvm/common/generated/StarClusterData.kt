package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StarClusterData
 * 
 * Full name:        System`StarClusterData
 * 
 *                   StarClusterData[entity, property] gives the value of the specified property for the star cluster entity.
 *                   StarClusterData[{entity , entity , …}, property] gives a list of property values for the specified star cluster entities.
 *                                          1        2
 * Usage:            StarClusterData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StarClusterData
 * Documentation:    web: http://reference.wolfram.com/language/ref/StarClusterData.html
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
fun starClusterData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StarClusterData", arguments.toMutableList(), options)
}
