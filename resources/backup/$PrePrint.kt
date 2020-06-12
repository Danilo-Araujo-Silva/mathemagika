package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $PrePrint
 *
 * Full name:        System`$PrePrint
 *
 * Usage:            $PrePrint is a global variable whose value, if set, is applied to every expression before it is printed.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/$PrePrint
 * Documentation:    web: http://reference.wolfram.com/language/ref/$PrePrint.html
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
fun `$PrePrint`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$PrePrint", arguments.toMutableList(), options)
}
