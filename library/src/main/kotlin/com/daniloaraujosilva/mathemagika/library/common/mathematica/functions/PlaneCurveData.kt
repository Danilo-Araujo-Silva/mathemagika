package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PlaneCurveData
 *
 * Full name:        System`PlaneCurveData
 *
 *                   PlaneCurveData[entity, property] gives the value of the specified property for the plane curve entity.
 *                   PlaneCurveData[{entity , entity , …}, property] gives a list of property values for the specified plane curve entities.
 *                                         1        2
 * Usage:            PlaneCurveData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlaneCurveData
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlaneCurveData.html
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
fun planeCurveData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlaneCurveData", arguments.toMutableList(), options)
}
