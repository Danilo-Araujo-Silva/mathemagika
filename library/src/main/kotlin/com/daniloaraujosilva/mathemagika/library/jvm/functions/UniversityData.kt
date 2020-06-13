package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UniversityData
 *
 * Full name:        System`UniversityData
 *
 *                   UniversityData[entity, property] gives the value of the specified property for the university entity.
 *                   UniversityData[{entity , entity , …}, property] gives a list of property values for the specified university entities.
 *                                         1        2
 * Usage:            UniversityData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UniversityData
 * Documentation:    web: http://reference.wolfram.com/language/ref/UniversityData.html
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
fun universityData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UniversityData", arguments.toMutableList(), options)
}
