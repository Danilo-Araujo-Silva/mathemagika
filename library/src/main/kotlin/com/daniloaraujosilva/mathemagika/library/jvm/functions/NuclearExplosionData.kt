package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NuclearExplosionData
 *
 * Full name:        System`NuclearExplosionData
 *
 *                   NuclearExplosionData[entity, property] gives the value of the specified property for the nuclear explosion entity.
 *                   NuclearExplosionData[{entity , entity , …}, property] gives a list of property values for the specified nuclear explosion entities.
 *                                               1        2
 * Usage:            NuclearExplosionData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NuclearExplosionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/NuclearExplosionData.html
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
fun nuclearExplosionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NuclearExplosionData", arguments.toMutableList(), options)
}
