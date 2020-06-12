package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DamData
 *
 * Full name:        System`DamData
 *
 *                   DamData[entity, property] gives the value of the specified property for the dam entity.
 *                   DamData[{entity , entity , …}, property] gives a list of property values for the specified dam entities.
 *                                  1        2
 * Usage:            DamData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DamData
 * Documentation:    web: http://reference.wolfram.com/language/ref/DamData.html
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
fun damData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DamData", arguments.toMutableList(), options)
}
