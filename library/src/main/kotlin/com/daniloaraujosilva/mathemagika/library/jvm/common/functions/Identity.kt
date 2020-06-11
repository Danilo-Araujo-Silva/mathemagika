package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

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
fun identity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Identity", arguments.toMutableList(), options)
}
