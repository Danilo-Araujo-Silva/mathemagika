package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Null
 *
 * Full name:        System`Null
 *
 * Usage:            Null is a symbol used to indicate the absence of an expression or a result. It is not displayed in ordinary output.  When Null appears as a complete output expression, no output is printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Null
 * Documentation:    web: http://reference.wolfram.com/language/ref/Null.html
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
fun `$FrontEnd`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$FrontEnd", arguments.toMutableList(), options)
}
