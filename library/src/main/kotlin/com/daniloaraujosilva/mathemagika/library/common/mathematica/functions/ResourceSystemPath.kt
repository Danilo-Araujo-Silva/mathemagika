package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceSystemPath
 *
 * Full name:        System`ResourceSystemPath
 *
 * Usage:            ResourceSystemPath is an option for ResourceObject, ResourceSearch and related functions for specifying locations at which to look for resources.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ResourceSystemPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceSystemPath.html
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
fun resourceSystemPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceSystemPath", arguments.toMutableList(), options)
}
