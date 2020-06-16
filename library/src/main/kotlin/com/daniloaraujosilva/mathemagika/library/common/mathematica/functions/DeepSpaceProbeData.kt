package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DeepSpaceProbeData
 *
 * Full name:        System`DeepSpaceProbeData
 *
 *                   DeepSpaceProbeData[entity, property] gives the value of the specified property for the deep space probe entity.
 *                   DeepSpaceProbeData[{entity , entity , …}, property] gives a list of property values for the specified deep space probe entities.
 *                                             1        2
 * Usage:            DeepSpaceProbeData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeepSpaceProbeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeepSpaceProbeData.html
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
fun deepSpaceProbeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeepSpaceProbeData", arguments.toMutableList(), options)
}
