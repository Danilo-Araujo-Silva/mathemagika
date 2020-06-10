package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VolcanoData
 * 
 * Full name:        System`VolcanoData
 * 
 *                   VolcanoData[entity, property] gives the value of the specified property for the volcano entity.
 *                   VolcanoData[{entity , entity , …}, property] gives a list of property values for the specified volcano entities.
 *                                      1        2
 * Usage:            VolcanoData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VolcanoData
 * Documentation:    web: http://reference.wolfram.com/language/ref/VolcanoData.html
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
fun volcanoData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VolcanoData", arguments.toMutableList(), options)
}
