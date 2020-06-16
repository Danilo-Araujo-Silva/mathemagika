package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AllowedCloudParameterExtensions
 *
 * Full name:        System`AllowedCloudParameterExtensions
 *
 * Usage:            AllowedCloudParameterExtensions is an option for APIFunction and related functions that specifies what extensions to allow for API or other input parameters.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/AllowedCloudParameterExtensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowedCloudParameterExtensions.html
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
fun allowedCloudParameterExtensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowedCloudParameterExtensions", arguments.toMutableList(), options)
}
