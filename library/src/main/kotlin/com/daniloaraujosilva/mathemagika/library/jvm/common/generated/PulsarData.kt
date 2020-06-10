package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PulsarData
 * 
 * Full name:        System`PulsarData
 * 
 *                   PulsarData[entity, property] gives the value of the specified property for the pulsar entity.
 *                   PulsarData[{entity , entity , …}, property] gives a list of property values for the specified pulsar entities.
 *                                     1        2
 * Usage:            PulsarData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PulsarData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PulsarData.html
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
fun pulsarData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PulsarData", arguments.toMutableList(), options)
}
