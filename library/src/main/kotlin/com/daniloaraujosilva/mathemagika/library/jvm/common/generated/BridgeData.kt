package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BridgeData
 * 
 * Full name:        System`BridgeData
 * 
 *                   BridgeData[entity, property] gives the value of the specified property for the bridge entity.
 *                   BridgeData[{entity , entity , …}, property] gives a list of property values for the specified bridge entities.
 *                                     1        2
 * Usage:            BridgeData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BridgeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/BridgeData.html
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
fun bridgeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BridgeData", arguments.toMutableList(), options)
}
