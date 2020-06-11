package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnderseaFeatureData
 *
 * Full name:        System`UnderseaFeatureData
 *
 *                   UnderseaFeatureData[entity, property] gives the value of the specified property for the undersea feature entity.
 *                   UnderseaFeatureData[{entity , entity , …}, property] gives a list of property values for the specified undersea feature entities.
 *                                              1        2
 * Usage:            UnderseaFeatureData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnderseaFeatureData
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnderseaFeatureData.html
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
fun underseaFeatureData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnderseaFeatureData", arguments.toMutableList(), options)
}
