package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnatomyData
 *
 * Full name:        System`AnatomyData
 *
 *                   AnatomyData[entity, property] gives the value of the specified property for the anatomical structure entity.
 *                   AnatomyData[{entity , entity , …}, property] gives a list of property values for the specified anatomical structure entities.
 *                                      1        2
 * Usage:            AnatomyData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnatomyData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnatomyData.html
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
fun anatomyData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnatomyData", arguments.toMutableList(), options)
}
