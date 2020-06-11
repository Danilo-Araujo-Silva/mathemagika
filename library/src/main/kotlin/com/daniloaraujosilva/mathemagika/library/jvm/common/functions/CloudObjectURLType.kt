package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudObjectURLType
 *
 * Full name:        System`CloudObjectURLType
 *
 * Usage:            CloudObjectURLType is an option for CloudObject and related objects that specifies the base type of URL to generate for the object.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CloudObjectURLType
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudObjectURLType.html
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
fun cloudObjectURLType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudObjectURLType", arguments.toMutableList(), options)
}
