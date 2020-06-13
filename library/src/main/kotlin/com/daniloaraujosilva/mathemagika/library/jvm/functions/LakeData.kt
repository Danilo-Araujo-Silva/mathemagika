package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LakeData
 *
 * Full name:        System`LakeData
 *
 *                   LakeData[entity, property] gives the value of the specified property for the lake entity.
 *                   LakeData[{entity , entity , …}, property] gives a list of property values for the specified lake entities.
 *                                   1        2
 * Usage:            LakeData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LakeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/LakeData.html
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
fun lakeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LakeData", arguments.toMutableList(), options)
}
