package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             $Post
 *
 * Full name:        System`$Post
 *
 * Usage:            $Post is a global variable whose value, if set, is applied to every output expression.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/$Post
 * Documentation:    web: http://reference.wolfram.com/language/ref/$Post.html
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
fun `$Post`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$Post", arguments.toMutableList(), options)
}
