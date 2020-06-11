package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeologicalPeriodData
 *
 * Full name:        System`GeologicalPeriodData
 *
 *                   GeologicalPeriodData[entity, property] gives the value of the specified property for the geological period entity.
 *                   GeologicalPeriodData[{entity , entity , …}, property] gives a list of property values for the specified period name entities.
 *                                               1        2
 * Usage:            GeologicalPeriodData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeologicalPeriodData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeologicalPeriodData.html
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
fun geologicalPeriodData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeologicalPeriodData", arguments.toMutableList(), options)
}
