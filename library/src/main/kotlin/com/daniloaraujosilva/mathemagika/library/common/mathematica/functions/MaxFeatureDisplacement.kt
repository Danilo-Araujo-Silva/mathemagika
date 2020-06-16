package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MaxFeatureDisplacement
 *
 * Full name:        System`MaxFeatureDisplacement
 *
 * Usage:            MaxFeatureDisplacement is an option that specifies the maximum displacement allowed for any feature.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxFeatureDisplacement
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxFeatureDisplacement.html
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
fun maxFeatureDisplacement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxFeatureDisplacement", arguments.toMutableList(), options)
}
