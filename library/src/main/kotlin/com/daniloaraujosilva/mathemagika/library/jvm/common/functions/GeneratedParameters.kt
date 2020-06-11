package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeneratedParameters
 *
 * Full name:        System`GeneratedParameters
 *
 * Usage:            GeneratedParameters is an option that specifies how parameters generated to represent the results of various symbolic operations should be named.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GeneratedParameters
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneratedParameters.html
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
fun generatedParameters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneratedParameters", arguments.toMutableList(), options)
}
