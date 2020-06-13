package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceSystemBase
 *
 * Full name:        System`ResourceSystemBase
 *
 * Usage:            ResourceSystemBase is an option for ResourceObject, ResourceSearch and related functions specifying the location of the public resource system.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResourceSystemBase
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceSystemBase.html
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
fun resourceSystemBase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceSystemBase", arguments.toMutableList(), options)
}
