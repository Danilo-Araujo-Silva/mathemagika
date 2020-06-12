package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $Failed
 *
 * Full name:        System`$Failed
 *
 * Usage:            $Failed is a special symbol returned by certain functions when they cannot do what they were asked to do.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/$Failed
 * Documentation:    web: http://reference.wolfram.com/language/ref/$Failed.html
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
fun `$CloudExpressionBase`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$CloudExpressionBase", arguments.toMutableList(), options)
}
