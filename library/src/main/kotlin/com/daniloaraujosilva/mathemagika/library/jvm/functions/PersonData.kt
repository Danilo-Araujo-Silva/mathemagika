package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PersonData
 *
 * Full name:        System`PersonData
 *
 *                   PersonData[entity, property] gives the value of the specified property for the person entity.
 *                   PersonData[{entity , entity , …}, property] gives a list of property values for the specified person entities.
 *                                     1        2
 * Usage:            PersonData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PersonData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PersonData.html
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
fun personData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PersonData", arguments.toMutableList(), options)
}
