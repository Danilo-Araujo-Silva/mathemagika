package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringRotateLeft
 *
 * Full name:        System`StringRotateLeft
 *
 *                   StringRotateLeft[string, n] cycles the characters in string n positions to the left.
 * Usage:            StringRotateLeft[string] cycles one position to the left.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringRotateLeft
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringRotateLeft.html
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
fun stringRotateLeft(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringRotateLeft", arguments.toMutableList(), options)
}
