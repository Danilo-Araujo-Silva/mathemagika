package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             True
 *
 * Full name:        System`True
 *
 * Usage:            True is the symbol for the Boolean value true.
 *
 * Options:          None
 *
 *                   Locked
 * Attributes:       Protected
 *
 *                   local: paclet:ref/True
 * Documentation:    web: http://reference.wolfram.com/language/ref/True.html
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
fun `$ActivationUserRegistered`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ActivationUserRegistered", arguments.toMutableList(), options)
}
