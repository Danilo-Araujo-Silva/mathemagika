package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AllowedCloudExtraParameters
 *
 * Full name:        System`AllowedCloudExtraParameters
 *
 * Usage:            AllowedCloudExtraParameters is an option for APIFunction and related functions that specifies whether parameters that affect overall cloud execution should be accepted.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/AllowedCloudExtraParameters
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowedCloudExtraParameters.html
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
fun allowedCloudExtraParameters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowedCloudExtraParameters", arguments.toMutableList(), options)
}
