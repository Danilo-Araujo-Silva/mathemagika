package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AdministrativeDivisionData
 *
 * Full name:        System`AdministrativeDivisionData
 *
 *                   AdministrativeDivisionData[entity, property] gives the value of the specified property for the administrative division entity.
 *                   AdministrativeDivisionData[{entity , entity , …}, property] gives a list of property values for the specified administrative division names.
 *                                                     1        2
 * Usage:            AdministrativeDivisionData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AdministrativeDivisionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AdministrativeDivisionData.html
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
fun administrativeDivisionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AdministrativeDivisionData", arguments.toMutableList(), options)
}
