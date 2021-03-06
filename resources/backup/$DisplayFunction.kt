package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Identity
 *
 * Full name:        System`Identity
 *
 * Usage:            Identity[expr] gives expr (the identity operation).
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Identity
 * Documentation:    web: http://reference.wolfram.com/language/ref/Identity.html
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
fun `$DisplayFunction`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$DisplayFunction", arguments.toMutableList(), options)
}
