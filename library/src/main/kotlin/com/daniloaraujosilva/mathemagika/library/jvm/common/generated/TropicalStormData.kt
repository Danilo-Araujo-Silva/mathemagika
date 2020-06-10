package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TropicalStormData
 * 
 * Full name:        System`TropicalStormData
 * 
 *                   TropicalStormData[entity, property] gives the value of the specified property for the tropical storm entity.
 *                   TropicalStormData[{entity , entity , …}, property] gives a list of property values for the specified tropical storm entities.
 *                                            1        2
 * Usage:            TropicalStormData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TropicalStormData
 * Documentation:    web: http://reference.wolfram.com/language/ref/TropicalStormData.html
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
fun tropicalStormData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TropicalStormData", arguments.toMutableList(), options)
}
