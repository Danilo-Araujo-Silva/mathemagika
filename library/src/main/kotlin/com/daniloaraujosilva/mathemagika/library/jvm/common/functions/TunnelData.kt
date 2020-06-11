package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TunnelData
 *
 * Full name:        System`TunnelData
 *
 *                   TunnelData[entity, property] gives the value of the specified property for the tunnel entity.
 *                   TunnelData[{entity , entity , …}, property] gives a list of property values for the specified tunnel entities.
 *                                     1        2
 * Usage:            TunnelData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TunnelData
 * Documentation:    web: http://reference.wolfram.com/language/ref/TunnelData.html
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
fun tunnelData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TunnelData", arguments.toMutableList(), options)
}
