package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             End
 *
 * Full name:        System`End
 *
 * Usage:            End[] returns the present context, and reverts to the previous one.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/End
 * Documentation:    web: http://reference.wolfram.com/language/ref/End.html
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
fun end(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("End", arguments.toMutableList(), options)
}
